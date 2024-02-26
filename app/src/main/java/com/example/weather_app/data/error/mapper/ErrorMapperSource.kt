package com.example.weather_app.data.error.mapper

interface ErrorMapperSource {
    fun getErrorString(errorId: Int): String
    val errorsMap: Map<Int, String>
}