package org.example.project.presentation.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CircularProgressBar(
    steps: Int,
    currentStep: Int
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        for (step in 1..steps) {
            Canvas(
                modifier = Modifier
                    .weight(1f) // Each step takes equal space
                    .height(5.dp)
                    .padding(horizontal = 2.dp)
            ) {
                drawCircle(
                    color = if (step == currentStep) Color(0xFF7FBB01) else Color.White,
                )
            }
        }
    }
}