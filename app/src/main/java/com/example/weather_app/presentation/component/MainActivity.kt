package com.example.weather_app.presentation.component

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weather_app.ResponsiveUI
import com.example.weather_app.presentation.component.main.MainScreen
import com.example.weather_app.presentation.component.main.MyViewModel
import com.example.weather_app.presentation.component.splash.SplashScreen
import com.example.weather_app.ui.theme.WeatherppTheme
import com.example.weather_pp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val windowSizeClass = calculateWindowSizeClass(this)
            val responsiveUI = ResponsiveUI(windowSizeClass)
            WeatherppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .paint(
                            painterResource(id = R.drawable.backgroundclouds),
                            contentScale = ContentScale.Crop,
                        ),
                    color = Color.Black.copy(alpha = 0.3f)
                ) {
                    Navigation(responsiveUI)
                }
            }
        }
    }

    @Composable
    fun Navigation(responsiveUI: ResponsiveUI) {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = "splash_screen"
        ) {
            composable("splash_screen") {
                SplashScreen(navController = navController)
            }
            // Main Screen
            composable("main_screen") {
                val viewModel = hiltViewModel<MyViewModel>()
                MainScreen(responsiveUI)
            }
        }
    }
}
