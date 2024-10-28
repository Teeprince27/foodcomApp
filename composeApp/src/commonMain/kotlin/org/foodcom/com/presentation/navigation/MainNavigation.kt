package org.foodcom.com.presentation.navigation

import foodcom.composeapp.generated.resources.Res
import foodcom.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.DrawableResource

sealed class MainNavigation(
    val route: String,
    val title: String,
    val selectedIcon: DrawableResource,
    val unSelectedIcon: DrawableResource,
) {

    data object Home : MainNavigation(
        route = "Home", title = "Home",
        selectedIcon = Res.drawable.compose_multiplatform,
        unSelectedIcon = Res.drawable.compose_multiplatform
    )

    data object Subscription : MainNavigation(
        route = "Subscription", title = "Subscription",
        selectedIcon = Res.drawable.compose_multiplatform,
        unSelectedIcon = Res.drawable.compose_multiplatform
    )

    data object MyOrder : MainNavigation(
        route = "MyOrder", title = "My Orders",
        selectedIcon = Res.drawable.compose_multiplatform,
        unSelectedIcon = Res.drawable.compose_multiplatform
    )



    data object Payment : MainNavigation(
        route = "Payment", title = "Payment",
        selectedIcon = Res.drawable.compose_multiplatform,
        unSelectedIcon = Res.drawable.compose_multiplatform
    )



    data object Help : MainNavigation(
        route = "Help", title = "Help/Feedback",
        selectedIcon = Res.drawable.compose_multiplatform,
        unSelectedIcon = Res.drawable.compose_multiplatform
    )


}

