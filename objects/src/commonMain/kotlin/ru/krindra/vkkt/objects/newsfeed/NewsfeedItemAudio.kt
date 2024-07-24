package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param audio 
 * @param postId Post ID
 * @param type 
 * @param sourceId Item source ID
 * @param date Date when item has been added in Unixtime
 * @param shortTextRate Preview length control parameter
 * @param feedback 
 */
@Serializable
data class NewsfeedItemAudio (
    @SerialName("source_id") val sourceId: Int,
    @SerialName("post_id") val postId: Int? = null,
    @SerialName("date") val date: Int/* WARN! Int? = null */,
    @SerialName("audio") val audio: NewsfeedItemAudioAudio? = null,
    @SerialName("short_text_rate") val shortTextRate: Double? = null,
    @SerialName("feedback") val feedback: NewsfeedItemWallpostFeedback? = null,
    @SerialName("type") val type: NewsfeedNewsfeedItemType/* WARN! WallPostType? = null */,
)
