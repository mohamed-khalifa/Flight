package com.khalifa.flight.presentation.entity

import com.khalifa.flight.domain.entity.FlightDomainEntities


data class FlightsState(
    val flights: List<FlightDomainEntities.FlightDomainItem> = listOf(),
    val errorMessage: String = "",
    val inProgress: Boolean = false
)
