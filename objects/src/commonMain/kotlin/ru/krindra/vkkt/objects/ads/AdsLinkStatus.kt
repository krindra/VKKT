package ru.krindra.vkkt.objects.ads

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
    @SerialName("status") val status: String,
    @SerialName("description") val description: String? = null,
    @SerialName("redirect_url") val redirectUrl: String? = null,
)
