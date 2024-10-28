//package org.example.project.presentation.component
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.Font
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.mysme.app.R
//
//
//@Composable
//fun FoodCardItem(
//    text : String,
//    secondText : String,
//    icon: Int,
//    onClick: () -> Unit,
//    modifier: Modifier = Modifier
//) {
//    Row(
//        modifier = Modifier
//            .clickable { onClick() }
//            .fillMaxWidth()
//            .height(64.dp)
//            .border(1.dp, Color(0xFFFAE100), RoundedCornerShape(8.dp))
//            .padding(vertical = 0.dp, horizontal = 0.dp)
//            .background(
//                color = Color(0xFFFAE100),
//            ),
//
//            verticalAlignment = Alignment.CenterVertically
//            ) {
//            Column (
//                modifier = Modifier.padding(start = 16.dp)
//            ){
//                Icon(
//                    painter = painterResource(id = R.drawable.credit_card),
//                    contentDescription = null,
//                    tint = Color(0xFF102572),
//                    modifier = Modifier.size(24.dp)
//
//                )
//            }
//
//              Column {
//                  Text(
//                      text = text,
//                      fontFamily = FontFamily(Font(R.font.inter_medium)),
//                      fontWeight = FontWeight.Bold,
//                      color = Color.Black,
//                      fontSize = 14.sp,
//                      modifier = Modifier.padding(start = 16.dp)
//                  )
//                  Text(
//                      text = secondText,
//                      fontFamily = FontFamily(Font(R.font.inter_medium)),
//                      color = Color.Black,
//                      fontSize = 14.sp,
//                      modifier = Modifier.padding(start = 16.dp)
//                  )
//              }
//
//                Spacer(Modifier.weight(1f)) // Push the next icon to the end
//
//            Text(
//                text = "Edit",
//                fontFamily = FontFamily(Font(R.font.inter_medium)),
//                color = Color.Black,
//                fontSize = 14.sp,
//                modifier = Modifier.padding(end = 16.dp)
//            )
//            }
//}
//
//
//@Composable
//@Preview(showBackground = true)
//fun FoodDebitCardItemPreview(){
//    FoodCardItem( "Payment","Bank transfer", R.drawable.credit_card, onClick = {})
//}
