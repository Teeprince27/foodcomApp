package org.foodcom.com.presentation.component//package org.example.project.presentation.component
//
//import androidx.compose.foundation.Image
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
//fun CartItem(
//    text : String,
//    amount : String,
//    number : String,
//    image: Int,
//    onClick: () -> Unit,
//    modifier: Modifier = Modifier
//) {
//    Row(
//        modifier = Modifier
//            .clickable { onClick() }
//            .fillMaxWidth()
//            .height(77.dp)
//            .border(1.dp, Color(0xFFE4E4E4), RoundedCornerShape(8.dp))
//            .padding(vertical = 20.dp, horizontal = 16.dp)
//            .background(
//                color = Color.Transparent,
//            ),
//
//            verticalAlignment = Alignment.CenterVertically
//            ) {
//               Image(
//                   painter = painterResource(image),
//                   contentDescription = "Food Image",
//
//                   )
//
//               Column {
//                   Text(
//                       text = text,
//                       fontFamily = FontFamily(Font(R.font.inter_medium, FontWeight.Medium)),
//                       color = Color.Black,
//                       fontSize = 14.sp,
//                       modifier = Modifier.padding(start = 16.dp)
//                   )
//                   Text(
//                       text = "N$amount",
//                       fontFamily = FontFamily(Font(R.font.inter_medium, FontWeight.Medium)),
//                       color = Color(0xFF007A58),
//                       fontSize = 14.sp,
//                       modifier = Modifier.padding(start = 16.dp)
//                   )
//               }
//
//                Spacer(Modifier.weight(1f)) // Push the next icon to the end
//
//               Row {
//                   Icon(
//                       painter = painterResource(id = R.drawable.ecobank_qr),
//                       contentDescription = null,
//                       tint = Color(0xFF102572),
//                       modifier = Modifier.size(20.dp)
//                   )
//
//                   Text(
//                       text = number,
//                       fontFamily = FontFamily(Font(R.font.inter_medium)),
//                       color = Color.Black,
//                       fontSize = 16.sp,
//                       modifier = Modifier.padding(horizontal = 12.dp)
//                   )
//
//                   Icon(
//                       painter = painterResource(id = R.drawable.baseline_add_24),
//                       contentDescription = null,
//                       tint = Color(0xFF102572),
//                       modifier = Modifier.size(20.dp)
//                   )
//               }
//            }
//}
//
//
//@Composable
//@Preview(showBackground = true)
//fun CartItemPreview(){
//    CartItem( "Nigerian Jollof rice & Chicken","5000", "2", R.drawable.tool_image, onClick = {})
//}
