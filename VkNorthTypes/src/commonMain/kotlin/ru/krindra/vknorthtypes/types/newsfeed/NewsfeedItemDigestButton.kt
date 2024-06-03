package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param title 
 * @param style 
 */
@Serializable
data class NewsfeedItemDigestButton (
    @SerialName("title") val title: String,
    @SerialName("style") val style: String? = null,
)
