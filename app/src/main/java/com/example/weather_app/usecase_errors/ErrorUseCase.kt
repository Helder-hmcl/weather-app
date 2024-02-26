package com.example.weather_app.usecase_errors

import com.example.weather_app.data.error.Error


interface ErrorUseCase {
    fun getError(errorCode: Int): Error
}