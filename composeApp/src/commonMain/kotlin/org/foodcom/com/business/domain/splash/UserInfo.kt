package org.foodcom.com.business.domain.splash

import kotlinx.serialization.Serializable

@Serializable
data class UserInfo(
    val statusCode: Int?,
    val message: String?,
    val token: String?,
    val user: User?,
    val isDeviceNew: Boolean?,
    val expireAt: String?
)

