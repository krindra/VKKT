package ru.krindra.vknorthtypes.types.widgets

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param canPost Information whether current user can comment the post
 * @param count Comments number
 * @param replies 
 * @param groupsCanPost Information whether groups can comment the post
 * @param canView Information whether current user can view the comments
 */
@Serializable
data class WidgetsCommentReplies (
    @SerialName("count") val count: Int? = null,
    @SerialName("can_post") val canPost: BaseBoolInt? = null,
    @SerialName("can_view") val canView: BaseBoolInt? = null,
    @SerialName("groups_can_post") val groupsCanPost: BaseBoolInt? = null,
    @SerialName("replies") val replies: List<WidgetsCommentRepliesItem>? = null,
)
