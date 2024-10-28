package org.foodcom.com.presentation.ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import foodcom.composeapp.generated.resources.Res
import foodcom.composeapp.generated.resources.backarrow
import foodcom.composeapp.generated.resources.compose_multiplatform
import foodcom.composeapp.generated.resources.ellipse
import foodcom.composeapp.generated.resources.ellipsegreen
import foodcom.composeapp.generated.resources.splashone
import foodcom.composeapp.generated.resources.splashthree
import foodcom.composeapp.generated.resources.splashtwo
import org.foodcom.com.presentation.component.ButtonComponent
import org.foodcom.com.presentation.navigation.SplashNavigation
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen2(
    popUp: () -> Unit,
    key: String?,
    navigateToSplashThree : () -> Unit,
    navigateToSplashFour : () -> Unit,
    navigateToLogin : () -> Unit,
    navigateToSignUp: () -> Unit,
){



    val title: String = when(key){
        SplashNavigation.SPLASH_SCREEN_TWO_KEY -> {
            "Your NO 1 Food Place"
        }
        SplashNavigation.SPLASH_SCREEN_THREE_KEY -> {
            "Create a Food Subscription Plan"
        }
        SplashNavigation.SPLASH_SCREEN_FOUR_KEY -> {
            "Fast Delivery"
        }

        else -> {
            ""
        }
    }

    val subText: String = when(key){
        SplashNavigation.SPLASH_SCREEN_TWO_KEY -> {
            "Treat yourself to a delightful meal"
        }
        SplashNavigation.SPLASH_SCREEN_THREE_KEY -> {
            "There’s no need to worry about placing an order everyday, we have you covered!"
        }
        SplashNavigation.SPLASH_SCREEN_FOUR_KEY -> {
            "With our fast delivery system, your food gets to you in no time!"
        }

        else -> {""}
    }


    val skip: String = when(key){
        SplashNavigation.SPLASH_SCREEN_TWO_KEY -> {
            "SKIP"

        }
        SplashNavigation.SPLASH_SCREEN_THREE_KEY -> {
            "SKIP"
        }
        SplashNavigation.SPLASH_SCREEN_FOUR_KEY -> {
            ""
        }

        else -> {
            ""
        }
    }

    val buttonText: String = when(key){
        SplashNavigation.SPLASH_SCREEN_TWO_KEY -> {
            "NEXT"
        }
        SplashNavigation.SPLASH_SCREEN_THREE_KEY -> {
            "NEXT"
        }
        SplashNavigation.SPLASH_SCREEN_FOUR_KEY -> {
            "GET STARTED"
        }

        else -> {
            ""
        }
    }


    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp)
            .padding(vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Row(){

            if(key == SplashNavigation.SPLASH_SCREEN_THREE_KEY ||
                key == SplashNavigation.SPLASH_SCREEN_FOUR_KEY) {
                Icon(
                    painter = painterResource(Res.drawable.backarrow),
                    tint = Color.Unspecified,
                    contentDescription = "Hello",
                    modifier = Modifier.clickable { popUp() }
                )
            }
            Spacer(Modifier.weight(1f))

            Text(
                text = skip,
                modifier = Modifier.clickable { navigateToSignUp() },
                color = Color(0xFF07020D)
            )
        }
        Spacer(modifier = Modifier.height(72.dp))
        Image(
            contentDescription = "Hello" ,
            painter = when(key){
                SplashNavigation.SPLASH_SCREEN_TWO_KEY -> {
                    painterResource(Res.drawable.splashone)
                }
                SplashNavigation.SPLASH_SCREEN_THREE_KEY -> {
                    painterResource(Res.drawable.splashtwo)
                }
                SplashNavigation.SPLASH_SCREEN_FOUR_KEY -> {
                    painterResource(Res.drawable.splashthree)
                }
                else -> {
                    painterResource(Res.drawable.splashone)
                }
            },
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier.height(36.dp))
        when(key){
            SplashNavigation.SPLASH_SCREEN_TWO_KEY -> {
                Row {
                    Icon(
                        painter = painterResource(Res.drawable.ellipsegreen),
                        contentDescription = "Hello",
                        modifier = Modifier.padding(end = 16.dp),
                        tint = Color.Unspecified

                    )
                    Icon(
                        painter = painterResource(Res.drawable.ellipse),
                        contentDescription = "Hello",
                        modifier = Modifier.padding(end = 16.dp),
                        tint = Color.Unspecified

                    )
                    Icon(
                        painter = painterResource(Res.drawable.ellipse),
                        contentDescription = "Hello",
                        tint = Color.Unspecified
                    )
                }
            }
            SplashNavigation.SPLASH_SCREEN_THREE_KEY -> {
                Row {
                    Icon(
                        painter = painterResource(Res.drawable.ellipse),
                        contentDescription = "Hello",
                        modifier = Modifier.padding(end = 16.dp),
                        tint = Color.Unspecified

                    )
                    Icon(
                        painter = painterResource(Res.drawable.ellipsegreen),
                        contentDescription = "Hello",
                        modifier = Modifier.padding(end = 16.dp),
                        tint = Color.Unspecified

                    )
                    Icon(
                        painter = painterResource(Res.drawable.ellipse),
                        contentDescription = "Hello",
                        tint = Color.Unspecified
                    )
                }
            }
            SplashNavigation.SPLASH_SCREEN_FOUR_KEY -> {
                Row {
                    Icon(
                        painter = painterResource(Res.drawable.ellipse),
                        contentDescription = "Hello",
                        modifier = Modifier.padding(end = 16.dp),
                        tint = Color.Unspecified

                    )
                    Icon(
                        painter = painterResource(Res.drawable.ellipse),
                        contentDescription = "Hello",
                        modifier = Modifier.padding(end = 16.dp),
                        tint = Color.Unspecified

                    )
                    Icon(
                        painter = painterResource(Res.drawable.ellipsegreen),
                        contentDescription = "Hello",
                        tint = Color.Unspecified
                    )
                }
            }
        }



        Spacer(modifier = Modifier.height(36.dp))

        Text(
            text = title,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = subText,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.weight(1f))

        ButtonComponent(
            buttonText = buttonText,
            onClick = {
                when(key){
                    SplashNavigation.SPLASH_SCREEN_TWO_KEY -> {
                        navigateToSplashThree()

                    }
                    SplashNavigation.SPLASH_SCREEN_THREE_KEY -> {
                        navigateToSplashFour()
                    }
                    SplashNavigation.SPLASH_SCREEN_FOUR_KEY -> {
                        navigateToSignUp()
                    }

                    else -> {
                        ""
                    }
                }

            },
            alpha = 1f

        )


    }


}