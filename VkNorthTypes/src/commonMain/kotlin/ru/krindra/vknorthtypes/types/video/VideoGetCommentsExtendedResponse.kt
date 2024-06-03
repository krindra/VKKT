package ru.krindra.vknorthtypes.types.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserFull
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull
import ru.krindra.vknorthtypes.types.wall.WallWallComment

/**
 * @param count Total number
 * @param items 
 * @param profiles 
 * @param groups 
 * @param currentLevelCount Count of replies of current level
 * @param canPost Information whether current user can comment the post
 * @param showReplyButton 
 * @param groupsCanPost Information whether groups can comment the post
 * @param realOffset 
 */
@Serializable
data class VideoGetCommentsExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("can_post") val canPost: Boolean? = null,
    @SerialName("items") val items: List<WallWallComment>,
    @SerialName("real_offset") val realOffset: Int? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>,
    @SerialName("profiles") val profiles: List<UsersUserFull>,
    @SerialName("groups_can_post") val groupsCanPost: Boolean? = null,
    @SerialName("current_level_count") val currentLevelCount: Int? = null,
    @SerialName("show_reply_button") val showReplyButton: Boolean? = null,
)

