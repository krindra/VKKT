package ru.krindra.vkkt.objects.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.comment.CommentThread
import ru.krindra.vkkt.objects.base.BaseLikesInfo

/**
 *
 * @param id Comment ID
 * @param fromId Author ID
 * @param canEdit 
 * @param postId 
 * @param ownerId 
 * @param parentsStack 
 * @param photoId 
 * @param videoId 
 * @param date Date when the comment has been added in Unixtime
 * @param text Comment text
 * @param attachments 
 * @param donut 
 * @param likes 
 * @param realOffset Real position of the comment
 * @param replyToUser Replied user ID
 * @param replyToComment Replied comment ID
 * @param thread 
 * @param deleted 
 * @param pid Photo ID
 */
@Serializable
data class WallWallComment (
    @SerialName("id") val id: Long,
    @SerialName("date") val date: Int,
    @SerialName("text") val text: String,
    @SerialName("from_id") val fromId: Long,
    @SerialName("pid") val pid: Long? = null,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("owner_id") val ownerId: Long? = null,
    @SerialName("photo_id") val photoId: Long? = null,
    @SerialName("video_id") val videoId: Long? = null,
    @SerialName("deleted") val deleted: Boolean? = null,
    @SerialName("likes") val likes: BaseLikesInfo? = null,
    @SerialName("real_offset") val realOffset: Int? = null,
    @SerialName("thread") val thread: CommentThread? = null,
    @SerialName("can_edit") val canEdit: BaseBoolInt? = null,
    @SerialName("reply_to_user") val replyToUser: Int? = null,
    @SerialName("donut") val donut: WallWallCommentDonut? = null,
    @SerialName("reply_to_comment") val replyToComment: Int? = null,
    @SerialName("parents_stack") val parentsStack: List<Int>? = null,
    @SerialName("attachments") val attachments: List<WallWallpostAttachment>? = null,
)
