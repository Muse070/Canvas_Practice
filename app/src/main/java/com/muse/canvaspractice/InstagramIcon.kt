package com.muse.canvaspractice

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun InstagramIcon() {
    val instaColors = listOf(Color.Yellow, Color.Red, Color.Magenta)
    Canvas(modifier = Modifier
        .size(100.dp)
        .padding(16.dp)
    ){
        drawRoundRect(
            brush = Brush.linearGradient(colors = instaColors),
            cornerRadius = CornerRadius(25f, 25f),
            style = Stroke(width = 15f, cap = StrokeCap.Round)
        )
        drawCircle(
            brush = Brush.linearGradient(colors = instaColors),
            radius = 30f,
            style = Stroke(width = 15f, cap = StrokeCap.Round)
        )
        drawCircle(
            brush = Brush.linearGradient(colors = instaColors),
            radius = 13f,
            center = Offset(this.size.width * .8f, this.size.height * 0.20f)
        )
    }
}