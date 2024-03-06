package com.example.weather_app.data.repository

import android.app.Application
import com.example.weather_app.data.remote.MyApi
import com.example.weather_app.domain.repository.MyRepository
import com.example.weather_pp.R
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {

    override suspend fun doNetworkCall() {
        val model = api.doNetworkCall()
        println("I am doing a network call and this is the model: $model")
    }
}
