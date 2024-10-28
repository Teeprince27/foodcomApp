package org.foodcom.com.business.domain.splash

import kotlinx.serialization.Serializable

@Serializable
data class Auth(
    val statusCode: Int = 0,
    val message: String = "",
    val data: UserInfo
)


@Serializable
data class TransactionPinResponse(
    val statusCode: Int?,
    val message: String?,
)
