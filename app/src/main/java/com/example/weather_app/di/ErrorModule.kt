package com.example.weather_app.di

import com.example.weather_app.data.error.mapper.ErrorMapper
import com.example.weather_app.data.error.mapper.ErrorMapperSource
import com.example.weather_app.usecase_errors.ErrorManager
import com.example.weather_app.usecase_errors.ErrorUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class ErrorModule {
    @Binds
    @Singleton
    abstract fun provideErrorFactoryImpl(errorManager: ErrorManager): ErrorUseCase

    @Binds
    @Singleton
    abstract fun provideErrorMapper(errorMapper: ErrorMapper): ErrorMapperSource
}