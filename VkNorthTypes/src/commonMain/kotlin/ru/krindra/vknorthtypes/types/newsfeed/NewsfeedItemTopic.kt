package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseCommentsInfo
import ru.krindra.vknorthtypes.types.base.BaseLikesInfo

/**
 *
 * @param comments 
 * @param likes 
 * @param postId Topic post ID
 * @param text Post text
 * @param type 
 * @param sourceId Item source ID
 * @param date Date when item has been added in Unixtime
 * @param shortTextRate Preview length control parameter
 * @param feedback 
 */
@Serializable
data class NewsfeedItemTopic (
    @SerialName("text") val text: String,
    @SerialName("post_id") val postId: Long,
    @SerialName("source_id") val sourceId: Long,
    @SerialName("likes") val likes: BaseLikesInfo? = null,
    @SerialName("date") val date: Int/* WARN! Int? = null */,
    @SerialName("comments") val comments: BaseCommentsInfo? = null,
    @SerialName("short_text_rate") val shortTextRate: Double? = null,
    @SerialName("feedback") val feedback: NewsfeedItemWallpostFeedback? = null,
    @SerialName("type") val type: NewsfeedNewsfeedItemType/* WARN! WallPostType? = null */,
)
