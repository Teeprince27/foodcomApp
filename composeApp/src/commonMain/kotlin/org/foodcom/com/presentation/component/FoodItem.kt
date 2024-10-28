package org.foodcom.com.presentation.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun FoodItem(
    text : String,
    amount : String,
    image: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .clickable { onClick() }
            .fillMaxWidth()
            .height(64.dp)
            .border(1.dp, Color(0xFFE4E4E4), RoundedCornerShape(8.dp))
            .padding(vertical = 20.dp, horizontal = 16.dp)
            .background(
                color = Color.Transparent,
            ),

            verticalAlignment = Alignment.CenterVertically
            ) {
               Image(
                   painter = image,
                   contentDescription = "Food Image",

                   )

                Text(
                    text = text,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 16.dp)
                )

                Spacer(Modifier.weight(1f)) // Push the next icon to the end

                Text(
                    text = "N$amount",
                    fontWeight = FontWeight.Medium,
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
}



