package com.khalifa.flight.domain.repository

import com.khalifa.flight.domain.entity.FlightDomainEntities

interface FlightsRepository {
    suspend fun getFlights(
        startDate: String,
        endDate: String
    ): FlightDomainEntities

    suspend fun getViewedFlights(): List<FlightDomainEntities.FlightDomainItem>
    suspend fun saveFlights(flights: List<FlightDomainEntities.FlightDomainItem>)
}
