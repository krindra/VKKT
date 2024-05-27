package ru.krindra.vknorthtypes.types.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param size Video size
 * @param videoId Video ID
 */
@Serializable
data class VideoUploadResponse (
    @SerialName("size") val size: Int? = null,
    @SerialName("video_id") val videoId: Long? = null,
)

