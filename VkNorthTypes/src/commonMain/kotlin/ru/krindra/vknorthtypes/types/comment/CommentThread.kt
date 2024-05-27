package ru.krindra.vknorthtypes.types.comment

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.wall.WallWallComment

/**
 *
 * @param count Comments number
 * @param items 
 * @param canPost Information whether current user can comment the post
 * @param showReplyButton Information whether recommended to display reply button
 * @param groupsCanPost Information whether groups can comment the post
 */
@Serializable
data class CommentThread (
    @SerialName("groups_can_post") val groupsCanPost: Boolean? = null,
    @SerialName("can_post") val canPost: Boolean? = null,
    @SerialName("show_reply_button") val showReplyButton: Boolean? = null,
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<WallWallComment>? = null,
)
