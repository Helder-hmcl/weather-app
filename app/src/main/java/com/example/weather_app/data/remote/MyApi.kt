package com.example.weather_app.data.remote

import com.example.weather_app.data.dto.WeatherModel
import retrofit2.http.GET

interface MyApi {
    @GET("forecast?latitude=40.66101&longitude=-7.90971&hourly=temperature_2m,rain&timezone=Europe%2FLondon")
    suspend fun doNetworkCall(): WeatherModel
}
