//package org.example.project.presentation.component
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.interaction.MutableInteractionSource
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material.ripple.rememberRipple
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.material3.TextFieldDefaults
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.saveable.rememberSaveable
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.colorResource
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.Font
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.input.ImeAction
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.mysme.app.R
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun FoodSearchBar(
//    text: String,
//    onTextChange: (String) -> Unit,
//    modifier: Modifier = Modifier
//) {
//    Card(
//        modifier = modifier
//            .fillMaxWidth(),
//        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
//        shape = RoundedCornerShape(10.dp),
//        border = CardDefaults.outlinedCardBorder(
//            enabled = true
//        )
//    ) {
//        TextField(
//            value = text,
//            onValueChange = onTextChange,
//            modifier = modifier
//                .fillMaxWidth()
//                .height(60.dp)
//                .background(
//                    color = Color.White, // Replace with actual color or drawable
//                    shape = RoundedCornerShape(4.dp) // Replace with actual shape if needed
//                )
//                .padding(start = 15.dp, end = 10.dp),
//            placeholder = {
//                Text(
//                    text = "what are you craving today?",
//                    fontFamily = FontFamily(Font(R.font.inter_regular)),
//                    color = colorResource(id = R.color.black), // Replace with actual color resource
//                    fontSize = 14.sp
//                )
//            },
//            leadingIcon = {
//                Icon(
//                    painter = painterResource(id = R.drawable.search_icon),
//                    contentDescription = null,
//                    tint = colorResource(id = R.color.black) // Replace with actual color resource
//                )
//            },
//            singleLine = true,
//            textStyle = TextStyle(
//                fontFamily = FontFamily(Font(R.font.inter_regular)),
//                color = colorResource(id = R.color.selected_value_color), // Replace with actual color resource
//                fontSize = 14.sp
//            ),
//            colors = TextFieldDefaults.textFieldColors(
//                containerColor = Color.Transparent,
//                focusedIndicatorColor = Color.Transparent,
//                unfocusedIndicatorColor = Color.Transparent
//            ),
//            keyboardOptions = KeyboardOptions.Default.copy(
//                keyboardType = KeyboardType.Text,
//                imeAction = ImeAction.Done
//            )
//        )
//    }
//}
//
//
//@Composable
//@Preview
//fun FoodSearchBarPreview(){
//
//var searchText by rememberSaveable { mutableStateOf("") }
//    FoodSearchBar(text = searchText,
//    onTextChange = { newText -> searchText = newText })
//}
