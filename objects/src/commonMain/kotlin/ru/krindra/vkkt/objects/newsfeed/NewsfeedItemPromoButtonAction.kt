package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param url 
 * @param type 
 * @param target 
 */
@Serializable
data class NewsfeedItemPromoButtonAction (
    @SerialName("url") val url: String? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("target") val target: String? = null,
)
