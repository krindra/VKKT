package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseLikesInfo
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.comment.CommentThread

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
    @SerialName("can_edit") val canEdit: BaseBoolInt? = null,
    @SerialName("real_offset") val realOffset: Int? = null,
    @SerialName("attachments") val attachments: List<WallWallpostAttachment>? = null,
    @SerialName("parents_stack") val parentsStack: List<Int>? = null,
    @SerialName("deleted") val deleted: Boolean? = null,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("date") val date: Int,
    @SerialName("from_id") val fromId: Long,
    @SerialName("video_id") val videoId: Long? = null,
    @SerialName("id") val id: Long,
    @SerialName("reply_to_comment") val replyToComment: Int? = null,
    @SerialName("pid") val pid: Long? = null,
    @SerialName("likes") val likes: BaseLikesInfo? = null,
    @SerialName("text") val text: String,
    @SerialName("photo_id") val photoId: Long? = null,
    @SerialName("thread") val thread: CommentThread? = null,
    @SerialName("reply_to_user") val replyToUser: Int? = null,
    @SerialName("owner_id") val ownerId: Long? = null,
    @SerialName("donut") val donut: WallWallCommentDonut? = null,
)
