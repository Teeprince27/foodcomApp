package org.foodcom.com

import androidx.compose.ui.window.ComposeUIViewController
import org.foodcom.com.common.Context

fun MainViewController() = ComposeUIViewController { App(Context()) }