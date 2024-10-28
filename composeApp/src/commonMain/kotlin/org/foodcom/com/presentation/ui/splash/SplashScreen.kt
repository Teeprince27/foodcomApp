package org.foodcom.com.presentation.ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import foodcom.composeapp.generated.resources.Res
import foodcom.composeapp.generated.resources.backarrow
import foodcom.composeapp.generated.resources.centerlogo
import foodcom.composeapp.generated.resources.firsscreen
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
internal fun SplashScreen(
    navigateToLogin: () -> Unit,
    navigateToWalkthrough: () -> Unit,
    navigateToWelcomeBack: () -> Unit,
//    authViewModel: AuthViewModel = viewModel(),
) {
    // Collect user data from ViewModel
//    val user by authViewModel.user.collectAsState()
    val user by rememberSaveable{ mutableStateOf(false )}

    // Load user data when the screen is first composed
//    LaunchedEffect(Unit) {
//        authViewModel.loadUserData()
//    }

    // Determine navigation destination after delay
    LaunchedEffect(user) {
        delay(3000L) // Display splash screen for 3 seconds

        // Ensure user is not null before accessing its properties
//        if (user != null) {
//            val profileSetupStatus = user!!.profileSetupStatus
//            val createdFromEcobankCred = user!!.createdFromEcobankCred
//
//            val destination = when (profileSetupStatus) {
//                ProfileSetupStatus.ACCOUNT_CREATED.toString(),
//                ProfileSetupStatus.PROFILE_SETUP_COMPLETED.toString(),
//                ProfileSetupStatus.AWAITING_ACCOUNT_NUMBER.toString(),
//                ProfileSetupStatus.ACCOUNT_NUMBER_RETRIEVED.toString() -> {
//                    if (createdFromEcobankCred == "Y" && profileSetupStatus == ProfileSetupStatus.PROFILE_SETUP_COMPLETED.toString()) {
//                        navigateToWelcomeBack
//                    } else {
//                        navigateToWelcomeBack
//                    }
//                }
//
//                else -> navigateToLogin
//            }
//            destination()
//        } else {
            // If user is null, navigate to login screen
            navigateToWalkthrough()
//        }
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Background image with blur effect
        Image(
            painter = painterResource(Res.drawable.firsscreen),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .blur(1.dp),
            )

        // Centered logo
        Image(
            painter = painterResource(Res.drawable.centerlogo),
            contentDescription = "hello",
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.Center), // Center the logo within the Box
        )




    }
}
