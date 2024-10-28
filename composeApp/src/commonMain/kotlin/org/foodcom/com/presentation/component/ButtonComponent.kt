package org.foodcom.com.presentation.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    buttonText: String,
    onClick: () -> Unit,
    fontSizeValue: TextUnit = 14.sp,
    alpha: Float = 0.5f
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(53.dp),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFF007A58).copy(alpha = alpha)
        )
    ) {
        Text(
            text = buttonText,
            color = Color.White,
            fontSize = fontSizeValue,
            fontFamily = FontFamily.SansSerif
        )
    }
}