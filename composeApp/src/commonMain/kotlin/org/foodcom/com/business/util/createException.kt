package org.foodcom.com.business.util

import org.foodcom.com.business.datasource.common.JAlertResponse


const val THROWABLE_DIVIDER = "THROWABLE_DIVIDER"

fun JAlertResponse.createException() =  Throwable(" $THROWABLE_DIVIDER ${this.message} $THROWABLE_DIVIDER ${this.message}")