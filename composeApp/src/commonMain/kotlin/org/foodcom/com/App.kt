package org.foodcom.com

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil3.ImageLoader
import coil3.annotation.ExperimentalCoilApi
import coil3.compose.setSingletonImageLoaderFactory
import coil3.fetch.NetworkFetcher
import com.ecobank.app.di.appModule
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import foodcom.composeapp.generated.resources.Res
import foodcom.composeapp.generated.resources.compose_multiplatform
import org.foodcom.com.common.Context
import org.foodcom.com.presentation.navigation.AppNavigation
import org.foodcom.com.presentation.theme.AppTheme
import org.foodcom.com.presentation.ui.splash.SplashNav
import org.koin.compose.KoinApplication

@OptIn(ExperimentalCoilApi::class)
@Composable
internal fun App(context: Context) {

    KoinApplication(application = {
        modules(appModule(context))
    }) {
        setSingletonImageLoaderFactory { context ->
            ImageLoader.Builder(context)
                .components {
                    add(NetworkFetcher.Factory())
                }
                .build()
        }

        AppTheme {
            val navigator = rememberNavController()

            Box(modifier = Modifier.fillMaxSize()) {
                NavHost(
                    navController = navigator,
                    startDestination = AppNavigation.Splash.route,
                    modifier = Modifier.fillMaxSize()
                ) {
                    composable(route = AppNavigation.Splash.route) {
                        SplashNav(navigateToMain = {
                            navigator.popBackStack()
                            navigator.navigate(AppNavigation.Main.route)
                        })
                    }
//                    composable(route = AppNavigation.Main.route) {
//                        MainNav {
//                            navigator.popBackStack()
//                            navigator.navigate(AppNavigation.Splash.route)
//                        }
//                    }
                }
            }

        }
    }
}