package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull
import ru.krindra.vknorthtypes.types.users.UsersUserFull

/**
 *
 * @param profiles 
 * @param groups 
 * @param count Total number
 * @param items 
 */
@Serializable
data class MessagesGetConversationByIdExtended (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<MessagesConversation>,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)
