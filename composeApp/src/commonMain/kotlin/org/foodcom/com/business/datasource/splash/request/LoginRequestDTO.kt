package org.foodcom.com.business.datasource.splash.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.foodcom.com.business.datasource.splash.request.DeviceInfoRequestDTO

@Serializable
data class LoginRequestDTO(
    @SerialName("email") val email: String,
    @SerialName("password") val password: String,
    @SerialName("deviceDetails") val deviceDetails: DeviceInfoRequestDTO
)

