package org.foodcom.com.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.foodcom.com.presentation.component.Spacer_16dp
import org.foodcom.com.presentation.component.Spacer_8dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodInputField(label: String, placeholder: String = "", modifier: Modifier = Modifier){
    var text by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
            .padding(horizontal = 0.dp)
            .background(color = Color(0xFFFAFAFF)),
        verticalArrangement = Arrangement.Center

    ) {
        Spacer_16dp()
        Text(
            text = label,
            fontSize = 14.sp,
            color = Color(0xFF3E3E3E),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 16.dp)
        )
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            placeholder = {
                Text(

                    text = placeholder,
                    color = Color.Black
                ) },
            modifier = Modifier
                .background(color = Color(0xFFFAFAFF))
                .fillMaxWidth()
                .height(52.dp),
            shape = RoundedCornerShape(9.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF007A58),
                unfocusedBorderColor = Color(0xFFFAFAFF)

            ),
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
        )
    }
}

