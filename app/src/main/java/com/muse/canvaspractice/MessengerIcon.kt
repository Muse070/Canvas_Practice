package com.muse.canvaspractice

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun MessengerIcon() {
    val colors = listOf(Color(0xFF02b8f9), Color(0xFF0277fe))
    Canvas(
        modifier = Modifier
            .size(100.dp)
            .padding(16.dp)
    ){

        val trianglePath = Path().apply {
            moveTo(size.width * .20f, size.height * .78f)
            lineTo(size.width * .20f, size.height * .95f)
            lineTo(size.width * .35f, size.height * .88f)
            close()
        }

        val electricPath = Path().apply {
            moveTo(size.width * .20f, size.height * .60f)
            lineTo(size.width * .45f, size.height * .35f)
            lineTo(size.width * .56f, size.height * .46f)
            lineTo(size.width * .78f, size.height * .35f)
            lineTo(size.width * .54f, size.height * .60f)
            lineTo(size.width * .43f, size.height * .45f)
            close()
        }

        drawOval(
            Brush.verticalGradient(colors = colors),
            size = Size(this.size.width, this.size.height * 0.95f)
        )

        drawPath(
            path = trianglePath,
            Brush.verticalGradient(colors = colors),
            style = Stroke(width = 15f, cap = StrokeCap.Round)
        )

        drawPath(
            path = electricPath,
            color = Color.White
        )
    }
}