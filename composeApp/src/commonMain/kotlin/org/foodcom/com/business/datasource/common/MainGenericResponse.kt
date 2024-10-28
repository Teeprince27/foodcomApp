package org.foodcom.com.business.datasource.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class MainGenericResponse<T>(
    @SerialName("result") var result: T?,
    @SerialName("status") var status: Boolean?,
    @SerialName("statusCode") var statusCode: Int?,
    @SerialName("message") var message: String?,
    @SerialName("alert") var alert: JAlertResponse? = JAlertResponse(),
)