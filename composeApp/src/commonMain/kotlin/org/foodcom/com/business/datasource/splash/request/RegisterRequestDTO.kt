package com.ecobank.app.business.datasource.network.splash.requests

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RegisterRequestDTO(
    @SerialName("email") val email: String,
    @SerialName("password") val password: String,
    @SerialName("preferredName") val preferredName: String,
    @SerialName("nationality") val nationality: String,
)
