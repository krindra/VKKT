package ru.krindra.vknorthtypes.types.newsfeed

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
    @SerialName("button") val button: NewsfeedItemDigestButton? = null,
    @SerialName("style") val style: String,
)
