package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.wall.WallWallComment
import ru.krindra.vkkt.objects.wall.WallWallpostCommentsDonut

/**
 *
 * @param canPost Information whether current user can comment the post
 * @param canOpen 
 * @param canClose 
 * @param canView Information whether current user can view the comments
 * @param count Comments number
 * @param groupsCanPost Information whether groups can comment the post
 * @param donut 
 * @param list 
 */
@Serializable
data class BaseCommentsInfo (
    @SerialName("count") val count: Int? = null,
    @SerialName("can_open") val canOpen: BaseBoolInt? = null,
    @SerialName("can_post") val canPost: BaseBoolInt? = null,
    @SerialName("can_view") val canView: BaseBoolInt? = null,
    @SerialName("can_close") val canClose: BaseBoolInt? = null,
    @SerialName("list") val list: List<WallWallComment>? = null,
    @SerialName("donut") val donut: WallWallpostCommentsDonut? = null,
    @SerialName("groups_can_post") val groupsCanPost: Boolean? = null,
)
