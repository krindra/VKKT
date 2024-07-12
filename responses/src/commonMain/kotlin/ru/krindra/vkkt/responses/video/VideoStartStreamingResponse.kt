package ru.krindra.vkkt.responses.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.video.*

/**
 * @param ownerId Owner ID of created video object
 * @param videoId Video ID of created video object
 * @param name Video title
 * @param description Video description
 * @param accessKey Video access key
 * @param stream 
 * @param postId 
 */
@Serializable
data class VideoStartStreamingResponse (
    @SerialName("name") val name: String,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("video_id") val videoId: Long,
    @SerialName("access_key") val accessKey: String,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("description") val description: String,
    @SerialName("stream") val stream: VideoStreamInputParams,
)

