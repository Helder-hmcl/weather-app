package com.example.weather_app.presentation.component.main

import androidx.lifecycle.ViewModel
import com.example.weather_app.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {
    init {
        CoroutineScope(Dispatchers.IO).launch {
            repository.doNetworkCall()
        }
    }
}
