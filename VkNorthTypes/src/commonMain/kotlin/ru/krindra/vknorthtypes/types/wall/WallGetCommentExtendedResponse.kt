package ru.krindra.vknorthtypes.types.wall

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

import ru.krindra.vknorthtypes.types.users.UsersUserFull


@Serializable
data class WallGetCommentExtendedResponse (
    val response: WallGetCommentExtendedRawResponse
) {
    /**
     *
     * @param items 
     * @param profiles 
     * @param groups 
     * @param canPost Information whether current user can comment the post
     * @param showReplyButton 
     * @param groupsCanPost Information whether groups can comment the post
     */
    @Serializable
    data class WallGetCommentExtendedRawResponse (
        @SerialName("items") val items: List<WallWallComment>,
        @SerialName("profiles") val profiles: List<UsersUserFull>,
        @SerialName("groups") val groups: List<GroupsGroupFull>,
        @SerialName("can_post") val canPost: Boolean? = null,
        @SerialName("show_reply_button") val showReplyButton: Boolean? = null,
        @SerialName("groups_can_post") val groupsCanPost: Boolean? = null,
    )
}
