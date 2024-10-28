package org.foodcom.com.business.datasource.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CommonResponse(
    @SerialName("statusCode") val statusCode: Int? = null,
    @SerialName("status") val status: Int? = null,
    @SerialName("message") val message: String = "",
    @SerialName("data") val data: String? = null,
    @SerialName("profileImg") val profileImg: String = "",
)


@Serializable
data class FetchBeneficiaryResponse(
    @SerialName("statusCode") val statusCode: Int? = null,
    @SerialName("message") val message: String = "",
    @SerialName("data") val data: ArrayList<Beneficiary>
)

@Serializable
data class Beneficiary(
    @SerialName("beneficiaryName") val beneficiaryName: String = "",
    @SerialName("bankName") val bankName: String = "",
    @SerialName("accountNumber") val accountNumber: String = "",
    @SerialName("beneficiaryID") val beneficiaryID: String = "",
)