package com.khalifa.flight.data.remote.datasource

import com.khalifa.flight.data.constant.NetworkStatus
import com.khalifa.flight.data.remote.entity.FlightResponse
import com.khalifa.flight.data.remote.service.ApiService
import com.khalifa.flight.data.util.safeApiCall

class FlightsRemoteDataSourceImpl(private val apiService: ApiService) {
    suspend fun getFlights(startDate: String, endDate: String): NetworkStatus<FlightResponse> =
        safeApiCall { apiService.getFlights(dateFrom = startDate, dateTo = endDate) }
}