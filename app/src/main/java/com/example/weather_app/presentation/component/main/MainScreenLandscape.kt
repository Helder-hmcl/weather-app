package com.example.weather_app.presentation.component.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather_pp.R

@Composable
fun MainScreenLandscape() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(10.dp),
        Arrangement.spacedBy(10.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column {
                Text(text = "San Francisco", color = Color.White, fontSize = 34.sp)
                Row {
                    Row(verticalAlignment = Alignment.Bottom) {
                        Text(text = "30", color = Color.White, fontSize = 50.sp)
                        Text(text = "ºC", color = Color.White, fontSize = 24.sp)
                    }
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.cloudyicon),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(Color.White),
                            modifier = Modifier.size(50.dp)
                        )
                    }
                }
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 50.dp),
                Arrangement.SpaceEvenly
            ) {
                Text(text = "1", color = Color.White)
                Text(text = "2", color = Color.White)
                Text(text = "3", color = Color.White)
            }
        }

        Spacer(modifier = Modifier.weight(1f))
        Card(
            Modifier.fillMaxWidth()
        ) {
            Row(
                Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                horizontalArrangement =
                Arrangement.SpaceEvenly
            ) {
                Day("Mon", 28)
                Day("Tue", 28)
                Day("Wed", 28)
                Day("Thu", 28)
                Day("Fri", 28)
            }
        }
    }
}
