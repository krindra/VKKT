package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull
import ru.krindra.vknorthtypes.types.users.UsersUserFull

/**
 * @param items 
 * @param profiles 
 * @param groups 
 * @param canPost Information whether current user can comment the post
 * @param showReplyButton 
 * @param groupsCanPost Information whether groups can comment the post
 */
@Serializable
data class WallGetCommentExtendedResponse (
    @SerialName("can_post") val canPost: Boolean? = null,
    @SerialName("items") val items: List<WallWallComment>,
    @SerialName("groups") val groups: List<GroupsGroupFull>,
    @SerialName("profiles") val profiles: List<UsersUserFull>,
    @SerialName("groups_can_post") val groupsCanPost: Boolean? = null,
    @SerialName("show_reply_button") val showReplyButton: Boolean? = null,
)

