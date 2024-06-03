package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserFull
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

/**
 * @param preview 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class MessagesGetChatPreviewResponse (
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("preview") val preview: MessagesChatPreview? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)

