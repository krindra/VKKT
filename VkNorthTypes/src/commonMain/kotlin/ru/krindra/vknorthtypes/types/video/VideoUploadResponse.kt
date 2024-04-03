package ru.krindra.vknorthtypes.types.video

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoUploadResponse (
    val response: VideoUploadRawResponse
) {
    /**
     *
     * @param size Video size
     * @param videoId Video ID
     */
    @Serializable
    data class VideoUploadRawResponse (
        @SerialName("size") val size: Int? = null,
        @SerialName("video_id") val videoId: Long? = null,
    )
}
