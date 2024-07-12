package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param url Action URL
 * @param consumeReason 
 */
@Serializable
data class BaseLinkButtonAction (
    @SerialName("url") val url: String? = null,
    @SerialName("type") val type: BaseLinkButtonActionType,
    @SerialName("consume_reason") val consumeReason: String? = null,
)
