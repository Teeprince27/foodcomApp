package org.foodcom.com.business.datasource.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class JAlertResponse(
    @SerialName("statusCode") val statusCode: Int? = null, // Example field
    @SerialName("message") val message: String? = null // Example field
)