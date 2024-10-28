package org.foodcom.com.presentation.ui.splash

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import foodcom.composeapp.generated.resources.Res
import foodcom.composeapp.generated.resources.compose_multiplatform
import org.foodcom.com.presentation.component.Spacer_16dp
import org.foodcom.com.presentation.component.Spacer_32dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun WalkthroughScreen(
    navigateToWelcome: () -> Unit
) {

    var currentStep by remember { mutableStateOf(1) }

    // List of images and texts
    val images = listOf(
        Res.drawable.compose_multiplatform,
        Res.drawable.compose_multiplatform,
    )
    val steps = images.size // Total steps

    val titles = listOf(
        "An app for your business",
        "Your Business, Our Priority",
    )
    val descriptions = listOf(
        "Sorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vulputate libero et velit interdum, ac aliquet odio mattis.",
        "Morem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vulputate libero et velit interdum, ac aliquet odio mattis."
    )
    LaunchedEffect(currentStep) {
        kotlinx.coroutines.delay(3000) // Delay for 3 seconds
        if (currentStep < steps) {
            currentStep++
        } else {
            currentStep = 1 // Reset to the first step when the end is reached
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(images[currentStep - 1]),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            Image(
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "stringResource(Res.string.app_name)",
                modifier = Modifier.size(70.dp),
            )

            Spacer_16dp()

            RectangularProgressBar(steps = images.size, currentStep = currentStep)
        }

        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.CenterEnd
        ) {
            Image(
                painter = painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(50.dp)
                    .clickable {
                        if (currentStep < steps) {
                            currentStep++
                        } else {
                            currentStep = 1 // Reset to the first step when the end is reached
                        }
                    }
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Bottom // Arrange children at the bottom
        ) {
            // This will create a spacer above the Box
            Spacer(modifier = Modifier.weight(1f))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.White.copy(alpha = 0.9f),
                        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
                    )
                    .padding(16.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(10.dp)
                ) {
                    Text(
                        text = titles[currentStep - 1],
                        color = Color.DarkGray,
                        fontSize = 20.sp,
                        style = MaterialTheme.typography.labelMedium
                    )
                    Spacer_32dp()
                    Text(
                        text = descriptions[currentStep - 1],
                        color = Color.DarkGray,
                        fontSize = 15.sp,
                        style = MaterialTheme.typography.bodySmall.copy(lineHeight = 25.sp) // Added line height
                    )

                    Spacer(modifier = Modifier.height(40.dp))

                    // Proceed Button
                    Button(
                        onClick = {
                            navigateToWelcome()
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(90.dp)
                            .padding(top = 30.dp, bottom = 10.dp),
                        shape = RoundedCornerShape(4.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF6CCF00),
                        )
                    ) {
                        Text(
                            text = "Get started",
                            fontSize = 16.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun RectangularProgressBar(
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
                drawRoundRect(
                    color = if (step == currentStep) Color(0xFF7FBB01) else Color.White,
                    size = size,
                    cornerRadius = androidx.compose.ui.geometry.CornerRadius(
                        6.dp.toPx(),
                        6.dp.toPx()
                    )
                )
            }
        }
    }
}