package org.foodcom.com.business.domain.splash

import kotlinx.serialization.Serializable

@Serializable
data class ErrorMessage(
    var code: Int = 0,
    var statusCode: Int = 0,
    var message: String? = null,
    var error: String? = null,
)