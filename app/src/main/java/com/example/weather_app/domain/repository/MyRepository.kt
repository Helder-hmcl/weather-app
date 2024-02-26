package com.example.weather_app.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}