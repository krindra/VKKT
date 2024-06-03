package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param width 
 * @param height 
 * @param url 
 */
@Serializable
data class NewsfeedItemPromoButtonImage (
    @SerialName("url") val url: String? = null,
    @SerialName("width") val width: Int? = null,
    @SerialName("height") val height: Int? = null,
)
