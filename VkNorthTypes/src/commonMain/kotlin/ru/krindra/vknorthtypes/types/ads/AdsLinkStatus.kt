package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param description Reject reason
 * @param redirectUrl URL
 * @param status Link status
 */
@Serializable
data class AdsLinkStatus (
    @SerialName("description") val description: String? = null,
    @SerialName("redirect_url") val redirectUrl: String? = null,
    @SerialName("status") val status: String,
)
