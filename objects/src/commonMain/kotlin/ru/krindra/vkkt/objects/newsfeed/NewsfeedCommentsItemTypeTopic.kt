package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseLikes

/**
 *
 * @param text 
 * @param comments 
 * @param likes 
 * @param type 
 * @param sourceId 
 * @param date 
 * @param postId 
 */
@Serializable
data class NewsfeedCommentsItemTypeTopic (
    @SerialName("date") val date: Int? = null,
    @SerialName("text") val text: String? = null,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("likes") val likes: BaseLikes? = null,
    @SerialName("source_id") val sourceId: Long? = null,
    @SerialName("comments") val comments: NewsfeedCommentsBase? = null,
    @SerialName("type") val type: NewsfeedNewsfeedItemType/* WARN! WallPostType? = null */,
)
