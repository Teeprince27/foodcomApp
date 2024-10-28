package org.foodcom.com.presentation.ui.splash

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.foodcom.com.presentation.component.ButtonComponent
import org.foodcom.com.presentation.component.FoodInputField
import org.foodcom.com.presentation.component.FoodInputFieldWithIcon
import org.foodcom.com.presentation.component.TitleBar


@Composable
fun SignUpScreen(
    navigateToDashBoard: () -> Unit,
    popUp: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 20.dp)
            .padding(bottom = 20.dp)
    ) {

        TitleBar(
            title = "Sign Up",
            onClick = { popUp() }
        )

        Spacer(modifier = Modifier.weight(1f))
        Column(){
            FoodInputField(label = "Name", placeholder = "FirstName LastName")
            FoodInputField(label = "Email Address", placeholder = "example@gmail.com")
            FoodInputField(label = "Phone Number", placeholder = "(+234) 00 0000 0000")
            FoodInputFieldWithIcon(label = "Create Passcode", placeholder = "000000")
            Text(
                text = "HINT: Passcode should be six figures that’s unique to you alone",
                color = Color(0xFFFA3D3D),
                modifier = Modifier.padding(start = 16.dp, end = 10.dp),
                fontSize = 10.sp
            )
            FoodInputFieldWithIcon(label = "Confirm Passcode", placeholder = "000000")
        }


        Spacer(modifier = Modifier.weight(1f))
        ButtonComponent(
            buttonText = "Sign Up",
            onClick = { navigateToDashBoard() },
            alpha = 1f
        )

    }

}