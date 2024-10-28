package org.foodcom.com.presentation.ui.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.foodcom.com.presentation.component.ButtonComponent
import org.foodcom.com.presentation.component.FoodCardPinInputField
import org.foodcom.com.presentation.component.Spacer_16dp
import org.foodcom.com.presentation.component.Spacer_32dp
import org.foodcom.com.presentation.component.TitleBar


@Composable
fun SignInScreen(
    navigateToSignUp: () -> Unit,
    navigateToDashBoard: () -> Unit,
    popUp: () -> Unit
){

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 20.dp)
            .padding(bottom = 20.dp)
    ) {



        Box(
            modifier = Modifier.fillMaxSize(), // Fills the available space in the TopAppBar
            contentAlignment = Alignment.Center // Centers the content inside the Box
        ) {
            Text(
                text = "Login",
                fontFamily = FontFamily.Default,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color(0xFF007A58)
            )
        }

        Spacer_16dp()

        FoodCardPinInputField(onPinEntered = {})



        Spacer_32dp()

        ButtonComponent(
            buttonText = "Sign Up",
            onClick = { navigateToDashBoard() },
            alpha = 1f
        )


    }


}