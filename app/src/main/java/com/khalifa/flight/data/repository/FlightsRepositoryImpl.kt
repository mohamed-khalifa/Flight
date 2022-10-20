package com.khalifa.flight.data.repository

import com.khalifa.flight.data.constant.Constants.GENERAL_ERROR
import com.khalifa.flight.data.local.datasource.ViewedFlightsLocalDataSource
import com.khalifa.flight.data.remote.datasource.FlightsRemoteDataSourceImpl
import com.khalifa.flight.data.remote.entity.FlightItem
import com.khalifa.flight.data.util.getStringDate
import com.khalifa.flight.domain.constants.Constants
import com.khalifa.flight.domain.entity.FlightDomainEntities
import com.khalifa.flight.domain.repository.FlightsRepository
import javax.inject.Inject

class FlightsRepositoryImpl @Inject constructor(
    private val flightsRemoteDataSourceImpl: FlightsRemoteDataSourceImpl,
    private val viewedFlightsLocalDataSource: ViewedFlightsLocalDataSource
) : FlightsRepository {

    override suspend fun getFlights(
        startDate: String,
        endDate: String
    ): FlightDomainEntities {

        val localFlights = viewedFlightsLocalDataSource.viewedFlightsByDate(startDate)
        if (localFlights.isNotEmpty()) {
            return FlightDomainEntities.FlightDomainEntity(localFlights)
        }

        val response = flightsRemoteDataSourceImpl.getFlights(startDate, endDate)
        return response.data?.flights?.let { flights ->
            FlightDomainEntities.FlightDomainEntity(
                (flights.map {
                    getFlightDomainItem(it, response.data.currency, startDate)
                })
            )
        } ?: run {
            FlightDomainEntities.Failure(response.errorMessage ?: GENERAL_ERROR)
        }
    }

    private fun getFlightDomainItem(flight: FlightItem, currency: String?, startDate: String) =
        FlightDomainEntities.FlightDomainItem(
            id = flight.id ?: "-1",
            from = "${flight.cityFrom ?: ""} (${flight.flyFrom ?: ""})",
            to = "${flight.cityTo ?: ""} (${flight.flyTo ?: ""})",
            flyDuration = flight.flyDuration ?: "",
            distance = "${flight.distance ?: 0} KM",
            price = flight.price ?: 0.0,
            currency = currency ?: "EUR",
            departureTime = flight.dTime?.let { (it * 1000).getStringDate(Constants.DD_MM_YYYY_HH_mm_FORMAT) }
                ?: "",
            arrivalTime = flight.aTime?.let { (it * 1000).getStringDate(Constants.DD_MM_YYYY_HH_mm_FORMAT) }
                ?: "",
            retrievalDate = startDate
        )


    override suspend fun getViewedFlights() = viewedFlightsLocalDataSource.viewedFlights()

    override suspend fun saveFlights(flights: List<FlightDomainEntities.FlightDomainItem>) =
        viewedFlightsLocalDataSource.saveFlights(flights)


}

