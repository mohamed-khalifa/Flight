package com.khalifa.flight.data.di

import com.khalifa.flight.data.local.datasource.ViewedFlightsLocalDataSource
import com.khalifa.flight.data.remote.datasource.FlightsRemoteDataSourceImpl
import com.khalifa.flight.data.remote.service.ApiService
import com.khalifa.flight.data.repository.FlightsRepositoryImpl
import com.khalifa.flight.domain.repository.FlightsRepository

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    fun provideFlightsRemoteDataSource(apiService: ApiService): FlightsRemoteDataSourceImpl {
        return FlightsRemoteDataSourceImpl(apiService)
    }

    @Provides
    fun provideFlightsRepository(
        remoteDataSource: FlightsRemoteDataSourceImpl,
        viewedFlightsLocalDataSource: ViewedFlightsLocalDataSource
    ): FlightsRepository = FlightsRepositoryImpl(remoteDataSource, viewedFlightsLocalDataSource)

}
