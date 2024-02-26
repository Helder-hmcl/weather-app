package com.example.weather_app.di

import android.app.Application
import com.example.weather_app.data.remote.MyApi
import com.example.weather_app.data.repository.MyRepositoryImpl
import com.example.weather_app.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://doesNotExist.com")
            .build()
            .create(MyApi::class.java)
    }
}