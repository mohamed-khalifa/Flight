package com.khalifa.flight.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.khalifa.flight.data.util.getCurrentDateTime
import com.khalifa.flight.domain.entity.FlightDomainEntities
import com.khalifa.flight.domain.usecase.FlightOffersUseCase
import com.khalifa.flight.presentation.entity.FlightsState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

@HiltViewModel
class FlightsViewModel @Inject constructor(
    private val flightOffersUseCase: FlightOffersUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(FlightsState())
    val uiState: StateFlow<FlightsState> = _uiState

    fun getFlightsOffers(startDate: Date = getCurrentDateTime()) {
        viewModelScope.launch {
            _uiState.value = FlightsState(inProgress = true)
            _uiState.value = when (val result = flightOffersUseCase.invoke(startDate)) {
                is FlightDomainEntities.FlightDomainEntity -> FlightsState(
                    result.flights
                )
                is FlightDomainEntities.Failure -> FlightsState(
                    errorMessage = result.errorText
                )
            }
        }
    }
}


