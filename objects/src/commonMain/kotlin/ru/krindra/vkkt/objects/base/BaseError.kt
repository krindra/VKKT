package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param errorCode Error code
 * @param errorSubcode Error subcode
 * @param errorMsg Error message
 * @param errorText Localized error message
 * @param requestParams 
 */
@Serializable
data class BaseError (
    @SerialName("error_code") val errorCode: Int,
    @SerialName("error_msg") val errorMsg: String? = null,
    @SerialName("error_text") val errorText: String? = null,
    @SerialName("error_subcode") val errorSubcode: Int? = null,
    @SerialName("request_params") val requestParams: List<BaseRequestParam>? = null,
)
