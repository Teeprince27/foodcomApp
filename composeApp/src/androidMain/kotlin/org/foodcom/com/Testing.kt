package org.foodcom.com

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import foodcom.composeapp.generated.resources.Res
import foodcom.composeapp.generated.resources.backarrow
import foodcom.composeapp.generated.resources.ellipse
import foodcom.composeapp.generated.resources.ellipsegreen
import foodcom.composeapp.generated.resources.splashone
import foodcom.composeapp.generated.resources.splashthree
import foodcom.composeapp.generated.resources.splashtwo
import org.foodcom.com.presentation.component.ButtonComponent
import org.foodcom.com.presentation.navigation.SplashNavigation
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun Testing(
    key: String?,
    navigateToSplashThree : () -> Unit,
    navigateToSplashFour : () -> Unit,
){


    fun naviagate(){

    }

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
        modifier = Modifier.fillMaxSize()

    ) {
        Row(){

            Icon(
                painter = when(key){
                    SplashNavigation.SPLASH_SCREEN_TWO_KEY -> {
                        painterResource(Res.drawable.ellipse)
                    }
                    SplashNavigation.SPLASH_SCREEN_THREE_KEY -> {
                        painterResource(Res.drawable.backarrow)
                    }
                    SplashNavigation.SPLASH_SCREEN_FOUR_KEY -> {
                        painterResource(Res.drawable.backarrow)
                    }
                    else -> {
                        painterResource(Res.drawable.ellipse)
                    }
                },

                contentDescription = "Hello"
            )

            Text(
                text = skip
            )
        }
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
            }
        )

//        when(key){
//            SplashNavigation.SPLASH_SCREEN_TWO_KEY -> {
//                painterResource(Res.drawable.compose_multiplatform)
//            }
//            SplashNavigation.SPLASH_SCREEN_THREE_KEY -> {
//                painterResource(Res.drawable.compose_multiplatform)
//            }
//            SplashNavigation.SPLASH_SCREEN_FOUR_KEY -> {
//                painterResource(Res.drawable.compose_multiplatform)
//            }
//            else -> {
//                painterResource(Res.drawable.compose_multiplatform)
//            }
//        },

        Row {
            Icon(
                painter = painterResource(Res.drawable.ellipsegreen),

                contentDescription = "Hello"
            )
            Icon(
                painter = painterResource(Res.drawable.ellipse),
                contentDescription = "Hello"
            )
            Icon(
                painter = painterResource(Res.drawable.ellipse),
                contentDescription = "Hello"
            )
        }

        Text(
            text = title
        )

        Text(
            text = subText
        )

        ButtonComponent(
            buttonText = buttonText,
            onClick = {
                when(key){
                    SplashNavigation.SPLASH_SCREEN_TWO_KEY -> {
                        ""

                    }
                    SplashNavigation.SPLASH_SCREEN_THREE_KEY -> {
                        navigateToSplashThree
                    }
                    SplashNavigation.SPLASH_SCREEN_FOUR_KEY -> {
                        navigateToSplashFour
                    }

                    else -> {
                        ""
                    }
                }

            }

        )


    }


}

@Preview
@Composable
fun TestingPreview() {
    Text(
        text = "Hello"
    )
//    Testing(
//        key = SplashNavigation.SPLASH_SCREEN_TWO_KEY,
//        navigateToSplashThree = {},
//        navigateToSplashFour = {}
//    )
}