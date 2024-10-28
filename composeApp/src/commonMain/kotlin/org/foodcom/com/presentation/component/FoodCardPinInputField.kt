package org.foodcom.com.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodCardPinInputField(
    onPinEntered: (String) -> Unit
) {

    val pinLength = 6
    val focusRequesters = List(pinLength) { FocusRequester() }
    val pin = remember { mutableStateListOf("", "", "", "", "", "") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(bottom = 10.dp)
        ) {
            for (i in 0 until 6) {
                OutlinedTextField(
                    value = pin[i],
                    onValueChange = { newValue: String ->
                        if (newValue.length <= 1) {
                            pin[i] = newValue
                            if (newValue.isNotEmpty() && i < pinLength - 1) {
                                focusRequesters[i + 1].requestFocus()
                            }
                            if (i == pinLength -1)
                                onPinEntered(pin.joinToString(","))
                        }

                    },
                    modifier = Modifier
                        .size(47.dp)
                        .clip(RoundedCornerShape(3.dp))
                        .background(Color.White)
                        .focusRequester(focusRequesters[i])
                    ,
                    singleLine = true,
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold,
                        textAlign = TextAlign.Center
                    ),
                    visualTransformation = PasswordVisualTransformation('\u002A'),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Number, // Set keyboard to numeric for PIN input
                        imeAction = if (i == pinLength - 1) ImeAction.Done else ImeAction.Next // Handle "Next" and "Done"
                    ),
                    keyboardActions = KeyboardActions(
                        onNext = { if (i < pinLength - 1) focusRequesters[i + 1].requestFocus() },
                        onDone = {
                            println( "CardPinInputField: $pin")
                            onPinEntered(pin.joinToString(","))
                        }
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        cursorColor = Color.Red,
                        focusedBorderColor = Color(0xFFCDCED1),
                        unfocusedBorderColor = Color(0xFFCDCED1)
                        ),

                )
            }
        }
    }
}


