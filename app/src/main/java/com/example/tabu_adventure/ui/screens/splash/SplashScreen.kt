package com.example.tabu_adventure.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tabu_adventure.R

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp, bottom = 40.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.macera),
            contentDescription = "SplashScreenLogo" )
    }
}