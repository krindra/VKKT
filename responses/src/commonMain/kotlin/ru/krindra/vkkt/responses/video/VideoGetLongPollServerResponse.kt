package ru.krindra.vkkt.responses.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.video.*

/**
 * @param url 
 */
@Serializable
data class VideoGetIntPollServerResponse (
    @SerialName("url") val url: String,
)

