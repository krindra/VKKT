package ru.krindra.vknorthtypes.types.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param url 
 */
@Serializable
data class VideoGetLongPollServerResponse (
    @SerialName("url") val url: String,
)

