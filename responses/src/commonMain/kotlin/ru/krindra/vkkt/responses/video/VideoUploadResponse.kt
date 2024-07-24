package ru.krindra.vkkt.responses.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.video.*

/**
 * @param size Video size
 * @param videoId Video ID
 */
@Serializable
data class VideoUploadResponse (
    @SerialName("size") val size: Int? = null,
    @SerialName("video_id") val videoId: Int? = null,
)

