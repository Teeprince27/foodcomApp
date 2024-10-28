package org.foodcom.com.business.domain.splash

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("user_id") val user_id: String? = null,
    @SerialName("firstName") val firstName: String? = null,
    @SerialName("lastName") val lastName: String? = null,
    @SerialName("phoneNumber") val phoneNumber: String? = null,
    @SerialName("email") val email: String? = null,
    @SerialName("preferredName") val preferredName: String? = null,
    @SerialName("gender") val gender: String? = null,
    @SerialName("dateOfBirth") val dateOfBirth: String? = null,
    @SerialName("hasVerifiedEmail") val hasVerifiedEmail: String? = null,
    @SerialName("profileSetupStatus") val profileSetupStatus: String? = null,
)
