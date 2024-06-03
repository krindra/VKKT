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
    @SerialName("date") val date: Int? = null,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("source_id") val sourceId: Long? = null,
    @SerialName("type") val type: NewsfeedNewsfeedItemType/* WARN! WallPostType? = null */,
)
