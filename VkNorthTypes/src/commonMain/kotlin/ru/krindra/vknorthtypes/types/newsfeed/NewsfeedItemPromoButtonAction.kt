package ru.krindra.vknorthtypes.types.newsfeed

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
    @SerialName("type") val type: String? = null,
    @SerialName("target") val target: String? = null,
    @SerialName("url") val url: String? = null,
)
