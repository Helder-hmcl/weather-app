package com.example.weather_app.presentation.base

import androidx.lifecycle.ViewModel
import com.example.weather_app.usecase_errors.ErrorManager
import javax.inject.Inject

abstract class BaseViewModel : ViewModel() {
    /**Inject Singleton ErrorManager
     * Use this errorManager to get the Errors
     */
    @Inject
    lateinit var errorManager: ErrorManager
}