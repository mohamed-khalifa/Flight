package com.khalifa.flight.data.local.datasource

import com.khalifa.flight.data.local.dao.ViewedFlightsDao
import com.khalifa.flight.domain.entity.FlightDomainEntities
import javax.inject.Inject

class ViewedFlightsLocalDataSource @Inject constructor(private val viewedFlightsDao: ViewedFlightsDao) {
    suspend fun saveFlights(flights: List<FlightDomainEntities.FlightDomainItem>) {
        return viewedFlightsDao.savedViewedFlights(flights)
    }
    suspend fun viewedFlights(): List<FlightDomainEntities.FlightDomainItem> {
        return viewedFlightsDao.viewedFlights()
    }

    suspend fun viewedFlightsByDate(startDate: String): List<FlightDomainEntities.FlightDomainItem> {
        return viewedFlightsDao.viewedFlightsByDate(startDate)
    }
}
