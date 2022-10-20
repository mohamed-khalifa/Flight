package com.khalifa.flight.domain.usecase

import com.khalifa.flight.data.util.addDaysToDate
import com.khalifa.flight.data.util.toString
import com.khalifa.flight.domain.constants.Constants
import com.khalifa.flight.domain.di.DispatcherModule
import com.khalifa.flight.domain.entity.FlightDomainEntities
import com.khalifa.flight.domain.repository.FlightsRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import java.util.*
import javax.inject.Inject


class FlightOffersUseCase @Inject constructor(
    private val flightsRepository: FlightsRepository,
    @DispatcherModule.IoDispatcher private val coroutineDispatcher: CoroutineDispatcher

) {
    suspend operator fun invoke(startDate: Date): FlightDomainEntities =
        withContext(coroutineDispatcher) {
            val result = flightsRepository.getFlights(
                startDate = startDate.toString(Constants.DD_MM_YYYY_FORMAT),
                endDate = startDate.addDaysToDate(30).toString(Constants.DD_MM_YYYY_FORMAT)
            )
            return@withContext if (result is FlightDomainEntities.FlightDomainEntity) {
                val viewedFlights = flightsRepository.getViewedFlights()
                val filteredFlights = result.flights.filter {
                    it.retrievalDate in viewedFlights.map { item -> item.retrievalDate }
                            || it.id !in viewedFlights.map { item -> item.id }
                }.take(5)
                flightsRepository.saveFlights(filteredFlights)
                FlightDomainEntities.FlightDomainEntity(filteredFlights)
            } else {
                result
            }
        }
}
