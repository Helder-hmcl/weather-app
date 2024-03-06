package com.example.weather_app.presentation.component.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.weather_app.ResponsiveUI

@Composable
fun MainScreen(responsiveUI: ResponsiveUI) {
    when {
        responsiveUI.isPortrait -> {
            MainScreenPortrait()
        }

        responsiveUI.isLandscape -> {
            MainScreenLandscape()
        }

        else -> {
            MainScreenPortrait()
        }
    }
}

@Composable
fun Day(dayOfTheWeek: String, temperature: Int) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(dayOfTheWeek)
        Text(
            text = temperature.toString(),
            color = MaterialTheme.colorScheme.onSurface,
        )
    }
}
