package com.example.weather_app

import androidx.compose.material3.windowsizeclass.WindowHeightSizeClass
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass

class ResponsiveUI(windowSizeClass: WindowSizeClass) {
    private val widthIsCompact = windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact
    private val widthIsMedium = windowSizeClass.widthSizeClass == WindowWidthSizeClass.Medium
    private val widthIsExpanded = windowSizeClass.widthSizeClass == WindowWidthSizeClass.Expanded

    private val heightIsCompact = windowSizeClass.heightSizeClass == WindowHeightSizeClass.Compact
    private val heightIsMedium = windowSizeClass.heightSizeClass == WindowHeightSizeClass.Medium
    private val heightIsExpanded = windowSizeClass.heightSizeClass == WindowHeightSizeClass.Expanded

    val isSmall = widthIsCompact && heightIsCompact
    val isMedium = widthIsMedium && heightIsMedium
    val isExpanded = widthIsExpanded && heightIsExpanded
    val isPortrait = heightIsExpanded && widthIsCompact
    val isLandscape = heightIsCompact && widthIsExpanded
}
