package ru.krindra.vkkt.responses.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.video.*

/**
 * @param uniqueViewers 
 */
@Serializable
data class VideoStopStreamingResponse (
    @SerialName("unique_viewers") val uniqueViewers: Int? = null,
)

