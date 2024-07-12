package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.wall.WallWallpostAttachment

/**
 *
 * @param text 
 * @param sourceName 
 * @param attachmentIndex 
 * @param attachment 
 * @param style 
 * @param post 
 * @param badgeText Optional red badge for posts in digest block
 * @param type 
 * @param sourceId Item source ID
 * @param date Date when item has been added in Unixtime
 * @param shortTextRate Preview length control parameter
 * @param feedback 
 */
@Serializable
data class NewsfeedItemDigestFullItem (
    @SerialName("source_id") val sourceId: Long,
    @SerialName("text") val text: String? = null,
    @SerialName("style") val style: String? = null,
    @SerialName("post") val post: NewsfeedItemWallpost,
    @SerialName("badge_text") val badgeText: String? = null,
    @SerialName("date") val date: Int/* WARN! Int? = null */,
    @SerialName("source_name") val sourceName: String? = null,
    @SerialName("attachment_index") val attachmentIndex: Int? = null,
    @SerialName("short_text_rate") val shortTextRate: Double? = null,
    @SerialName("attachment") val attachment: WallWallpostAttachment? = null,
    @SerialName("feedback") val feedback: NewsfeedItemWallpostFeedback? = null,
    @SerialName("type") val type: NewsfeedNewsfeedItemType/* WARN! WallPostType? = null */,
)
