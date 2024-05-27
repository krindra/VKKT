package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.wall.WallWallpostCommentsDonut
import ru.krindra.vknorthtypes.types.wall.WallWallComment
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param list 
 * @param canPost Information whether current user can comment the post
 * @param canOpen 
 * @param canClose 
 * @param canView Information whether current user can view the comments
 * @param count Comments number
 * @param groupsCanPost Information whether groups can comment the post
 * @param donut 
 */
@Serializable
data class NewsfeedCommentsBase (
    @SerialName("count") val count: Int? = null,
    @SerialName("groups_can_post") val groupsCanPost: Boolean? = null,
    @SerialName("can_open") val canOpen: BaseBoolInt? = null,
    @SerialName("can_close") val canClose: BaseBoolInt? = null,
    @SerialName("can_view") val canView: BaseBoolInt? = null,
    @SerialName("list") val list: List<WallWallComment>? = null,
    @SerialName("can_post") val canPost: BaseBoolInt? = null,
    @SerialName("donut") val donut: WallWallpostCommentsDonut? = null,
)
