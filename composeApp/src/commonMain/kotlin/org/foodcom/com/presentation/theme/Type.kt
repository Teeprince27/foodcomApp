package org.foodcom.com.presentation.theme


import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import foodcom.composeapp.generated.resources.Res
import foodcom.composeapp.generated.resources.inter_black
import foodcom.composeapp.generated.resources.inter_bold
import foodcom.composeapp.generated.resources.inter_extrabold
import foodcom.composeapp.generated.resources.inter_light
import foodcom.composeapp.generated.resources.inter_medium
import foodcom.composeapp.generated.resources.inter_regular
import foodcom.composeapp.generated.resources.inter_semibold
import foodcom.composeapp.generated.resources.inter_thin
import foodcom.composeapp.generated.resources.inter_ultralight
import org.jetbrains.compose.resources.Font


@Composable
fun InterTypography(): Typography {
    val inter = FontFamily(
        Font(
            resource = Res.font.inter_regular,
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        ),
        Font(
            resource = Res.font.inter_thin,
            weight = FontWeight.Thin,
            style = FontStyle.Normal
        ),
        Font(
            resource = Res.font.inter_black,
            weight = FontWeight.Bold,
            style = FontStyle.Normal
        ),
        Font(
            resource = Res.font.inter_semibold,
            weight = FontWeight.SemiBold,
            style = FontStyle.Normal
        ),
        Font(
            resource = Res.font.inter_ultralight,
            weight = FontWeight.ExtraLight,
            style = FontStyle.Normal
        ),
        Font(
            resource = Res.font.inter_extrabold,
            weight = FontWeight.ExtraBold,
            style = FontStyle.Normal
        ),
        Font(
            resource = Res.font.inter_medium,
            weight = FontWeight.Medium,
            style = FontStyle.Normal
        ),
        Font(
            resource = Res.font.inter_bold,
            weight = FontWeight.Bold,
            style = FontStyle.Normal
        ),
        Font(
            resource = Res.font.inter_light,
            weight = FontWeight.Light,
            style = FontStyle.Normal
        ),
    )

    return Typography(
        headlineSmall = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
            fontFamily = inter
        ),
        titleLarge = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
            fontFamily = inter
        ),
        bodyLarge = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            fontFamily = inter
        ),
        bodyMedium = TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            fontFamily = inter
        ),
        labelMedium = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            fontFamily = inter
        ),
    )
}
