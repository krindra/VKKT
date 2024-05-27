package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param sourceId 
 * @param date 
 * @param postId 
 */
@Serializable
data class NewsfeedCommentsItemBase (
    @SerialName("type") val type: NewsfeedNewsfeedItemType/* WARN! WallPostType? = null */,
    @SerialName("date") val date: Int? = null,
    @SerialName("source_id") val sourceId: Long? = null,
    @SerialName("post_id") val postId: Long? = null,
)
