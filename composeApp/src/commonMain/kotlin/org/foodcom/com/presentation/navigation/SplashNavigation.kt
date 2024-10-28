package org.foodcom.com.presentation.navigation

import androidx.navigation.NamedNavArgument

sealed class SplashNavigation(
    val route: String, val arguments: List<NamedNavArgument>
) {

    //        Navigation keys
    companion object {
        const val SPLASH_SCREEN_TWO_KEY = "splash_two"
        const val SPLASH_SCREEN_THREE_KEY = "splash_three"
        const val SPLASH_SCREEN_FOUR_KEY = "splash_four"

    }



    data object Splash : SplashNavigation(route = "Splash", arguments = emptyList())

    data object Login : SplashNavigation(route = "Login", arguments = emptyList())

    data object Register : SplashNavigation(route = "Register", arguments = emptyList())
    data object WelcomeBack : SplashNavigation(route = "WelcomeBack", arguments = emptyList())


    data object ResetPassword : SplashNavigation(route = "ResetPassword", arguments = emptyList())
    data object ForgotPassword : SplashNavigation(route = "ForgotPassword", arguments = emptyList())

    data object VerifyOTP : SplashNavigation(route = "VerifyOTP", arguments = emptyList())
    data object ResendVerification :
        SplashNavigation(route = "ResendVerification", arguments = emptyList())

    data object VerifyEmail : SplashNavigation(route = "VerifyEmail", arguments = emptyList())
    data object CompleteProfileOne : SplashNavigation(route = "CompleteProfileOne", arguments = emptyList())
    data object CompleteProfileTwo : SplashNavigation(route = "CompleteProfileTwo", arguments = emptyList())

    data object AccountCreated : SplashNavigation(route = "AccountCreated", arguments = emptyList())
    data object EmailVerification : SplashNavigation(route = "EmailVerification", arguments = emptyList())
    data object EmailExistVerification : SplashNavigation(route = "EmailExistVerification", arguments = emptyList())

    data object PinSetup : SplashNavigation(route = "PinSetup", arguments = emptyList())

    data object Welcome : SplashNavigation(route = "Welcome", arguments = emptyList())

    data object ProfileSetupNew : SplashNavigation(route = "ProfileSetupNew", arguments = emptyList())
    data object SignUpNewToBank : SplashNavigation(route = "SignUpNewToBank", arguments = emptyList())

    data object ProfileSetupNewBank : SplashNavigation(route = "ProfileSetup", arguments = emptyList())

    data object EmailVerificationNewBank: SplashNavigation(route = "EmailVerificationNewBank", arguments = emptyList())

    data object PhoneNumberVerificationNewBank: SplashNavigation(route = "PhoneNumberVerificationNewBank", arguments = emptyList())

    data object AccountCreatedSuccess : SplashNavigation(route = "AccountCreatedSuccess", arguments = emptyList())

    data object SignUpExists : SplashNavigation(route = "SignUpExists", arguments = emptyList())
    data object ProfileSetUp : SplashNavigation(route = "ProfileSetUp", arguments = emptyList())

    // NEW DESIGN

    data object EnterEmailAddressScreen: SplashNavigation(route = "EnterEmailAddress", arguments = emptyList())

    data object VerifyEmailAddressScreen: SplashNavigation(route = "VerifyEmailAddress", arguments = emptyList())

    data object BusinessDetailsScreen: SplashNavigation(route = "BusinessDetailsScreen", arguments = emptyList())
    data object VerificationSuccessScreen : SplashNavigation(route = "VerificationSuccess", arguments = emptyList())

    data object PersonalDetailsScreen : SplashNavigation(route = "PersonalDetails", arguments = emptyList())
    data object VerifyMobileNumberScreen : SplashNavigation(route = "MobileNumberScreen", arguments = emptyList())
    data object TermsAndConditionScreen : SplashNavigation(route = "TermsAndCondition", arguments = emptyList())
    data object AccountNumber : SplashNavigation(route = "AccountNumber", arguments = emptyList())
    data object EcobankOnline : SplashNavigation(route = "EcobankOnline", arguments = emptyList())
    data object EcobankCard : SplashNavigation(route = "EcobankCard", arguments = emptyList())
    data object OmniLite : SplashNavigation(route = "OmniLite", arguments = emptyList())

    data object SelectBusiness : SplashNavigation(route = "SelectBusiness", arguments = emptyList())

    data object BusinessDetails : SplashNavigation(route = "BusinessDetails", arguments = emptyList())


    data object UploadSignature : SplashNavigation(route = "UploadSignature", arguments = emptyList())
    data object DetailsSubmitted : SplashNavigation(route = "DetailsSubmitted", arguments = emptyList())

    data object CreatePassword : SplashNavigation(route = "CreatePassword", arguments = emptyList())
    data object SignUpNew : SplashNavigation(route = "SignUpNew", arguments = emptyList())
    data object Otp : SplashNavigation(route = "Otp", arguments = emptyList())
    data object CreateProfile : SplashNavigation(route = "CreateProfile", arguments = emptyList())
    data object VerifyEmailNew : SplashNavigation(route = "VerifyEmailNew", arguments = emptyList())
    data object Walkthrough : SplashNavigation(route = "Walkthrough", arguments = emptyList())
    data object BiometricAuth : SplashNavigation(route = "BiometricAuth", arguments = emptyList())
    data object IDCaptureNew : SplashNavigation(route = "IDCapture", arguments = emptyList())
    data object ILivelySelfie : SplashNavigation(route = "ILivelySelfie", arguments = emptyList())
    data object BusinessDetailsNew : SplashNavigation(route = "BusinessDetailsNew", arguments = emptyList())
    data object UploadSignatureNew : SplashNavigation(route = "UploadSignatureNew", arguments = emptyList())

}


