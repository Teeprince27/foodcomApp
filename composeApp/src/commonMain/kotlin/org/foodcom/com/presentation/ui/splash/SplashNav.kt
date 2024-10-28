package org.foodcom.com.presentation.ui.splash

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.foodcom.com.common.ChangeStatusBarColors
import org.foodcom.com.presentation.navigation.SplashNavigation

@Composable
internal fun SplashNav(
//    authViewModel: AuthViewModel = koinInject(),
//    homeViewModel: HomeViewModel = koinInject(),
    navigateToMain: () -> Unit
) {
    val navigator = rememberNavController()

    ChangeStatusBarColors(Color.White)
    NavHost(
        startDestination = SplashNavigation.Splash.route,
        navController = navigator,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(route = SplashNavigation.Splash.route) {
            SplashScreen(
                navigateToLogin = {
                    navigator.popBackStack()
                    navigator.navigate(SplashNavigation.Login.route)
                },
                navigateToWelcomeBack = {
                    navigator.popBackStack()
                    navigator.navigate(SplashNavigation.WelcomeBack.route)
                },
                navigateToWalkthrough = {
                    navigator.popBackStack()
                    navigator.navigate("${SplashNavigation.Walkthrough.route}/${SplashNavigation.SPLASH_SCREEN_TWO_KEY}")
                },
//                authViewModel = authViewModel,
            )
        }


        composable(route = "${SplashNavigation.Walkthrough.route}/{key}",

            arguments = listOf(navArgument("key") { type = NavType.StringType })
        ) {backStackEntry ->
             val key =  backStackEntry.arguments?.getString("key")

            SplashScreen2(
                popUp = { navigator.popBackStack() },
                navigateToSplashThree = {
                    navigator.navigate("${SplashNavigation.Walkthrough.route}/${SplashNavigation.SPLASH_SCREEN_THREE_KEY}")
                },
                navigateToSplashFour = {
                    navigator.navigate("${SplashNavigation.Walkthrough.route}/${SplashNavigation.SPLASH_SCREEN_FOUR_KEY}")
                },
                navigateToLogin = {
                    navigator.navigate(SplashNavigation.Login.route)
                },
                navigateToSignUp = {
                    navigator.navigate(SplashNavigation.SignUpNew.route)
                },
                key = key
            )
        }

        composable(route = SplashNavigation.Login.route) {
            SignInScreen(
                navigateToSignUp = {
                    navigator.navigate(SplashNavigation.Login.route)
                },
                navigateToDashBoard = {

                },
                popUp = {navigator.popBackStack() }
            )
        }

        composable(route = SplashNavigation.SignUpNew.route) {
            SignUpScreen(
                navigateToDashBoard = {
                    navigator.navigate(SplashNavigation.Login.route)
                },
                popUp = {navigator.navigateUp() }
            )
        }
    }
}


