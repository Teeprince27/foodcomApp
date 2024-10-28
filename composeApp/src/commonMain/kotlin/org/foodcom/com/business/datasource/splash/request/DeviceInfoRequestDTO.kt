package org.foodcom.com.business.datasource.splash.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DeviceInfoRequestDTO(
    @SerialName("deviceToken") val deviceToken: String = "",
    @SerialName("deviceOS") val deviceOS: String = "",
    @SerialName("deviceType") val deviceType: String = "",
    @SerialName("deviceID") val deviceID: String = ""
)