package org.foodcom.com.presentation.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import foodcom.composeapp.generated.resources.Res
import foodcom.composeapp.generated.resources.backarrow
import org.jetbrains.compose.resources.painterResource


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TitleBar(
    title: String,
    onClick: () -> Unit
) {
    TopAppBar(

        modifier = Modifier.padding(0.dp),
        colors = TopAppBarColors(
            containerColor = Color.White,
            navigationIconContentColor = Color(0xFF005B82),
            titleContentColor = Color(0xFF005B82),
            actionIconContentColor = Color(0xFF005B82),
            scrolledContainerColor = Color.Transparent
        ),
        title = {
            Box(
                modifier = Modifier.fillMaxSize(), // Fills the available space in the TopAppBar
                contentAlignment = Alignment.Center // Centers the content inside the Box
            ) {
                Text(
                    text = title,
                    fontFamily = FontFamily.Default,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(0xFF007A58)
                )
            }
        },
        navigationIcon = {
            IconButton(onClick = { onClick() }) {
                Icon(
                    painter = painterResource(Res.drawable.backarrow),
                    contentDescription = "back button",
                    tint = Color.Unspecified
                )
            }
        }
    )
}
