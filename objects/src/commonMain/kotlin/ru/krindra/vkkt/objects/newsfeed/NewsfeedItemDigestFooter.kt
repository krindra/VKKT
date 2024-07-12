package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param style 
 * @param text text for invite to enable smart feed
 * @param button 
 */
@Serializable
data class NewsfeedItemDigestFooter (
    @SerialName("text") val text: String,
    @SerialName("style") val style: String,
    @SerialName("button") val button: NewsfeedItemDigestButton? = null,
)
