package ru.krindra.vknorthtypes.types.newsfeed

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
    @SerialName("source_id") val sourceId: Long,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("date") val date: Int/* WARN! Int? = null */,
    @SerialName("audio") val audio: NewsfeedItemAudioAudio? = null,
    @SerialName("short_text_rate") val shortTextRate: Double? = null,
    @SerialName("feedback") val feedback: NewsfeedItemWallpostFeedback? = null,
    @SerialName("type") val type: NewsfeedNewsfeedItemType/* WARN! WallPostType? = null */,
)
