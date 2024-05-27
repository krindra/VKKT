package ru.krindra.vknorthtypes.types.board

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.wall.WallCommentAttachment
import ru.krindra.vknorthtypes.types.base.BaseLikesInfo
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param attachments 
 * @param date Date when the comment has been added in Unixtime
 * @param fromId Author ID
 * @param id Comment ID
 * @param realOffset Real position of the comment
 * @param text Comment text
 * @param canEdit Information whether current user can edit the comment
 * @param likes 
 */
@Serializable
data class BoardTopicComment (
    @SerialName("attachments") val attachments: List<WallCommentAttachment>? = null,
    @SerialName("id") val id: Long,
    @SerialName("can_edit") val canEdit: BaseBoolInt? = null,
    @SerialName("real_offset") val realOffset: Int? = null,
    @SerialName("likes") val likes: BaseLikesInfo? = null,
    @SerialName("date") val date: Int,
    @SerialName("from_id") val fromId: Long,
    @SerialName("text") val text: String,
)
