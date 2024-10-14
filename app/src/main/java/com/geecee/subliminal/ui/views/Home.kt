package com.geecee.subliminal.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.geecee.subliminal.R
import com.geecee.subliminal.ui.theme.SubliminalTheme

@Composable
fun HomePage(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(
                        Color(40, 73, 123, 255),
                        Color(68,177,202,0)
                    ),
                    center = Offset(0f,0f),
                    radius = 1000f
                )
            )
    ) {
        // Your content here
    }
}

@Preview(showBackground = true)
@Composable
fun HomePagePrev(){
    SubliminalTheme {
        HomePage()
    }
}