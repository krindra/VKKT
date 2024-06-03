package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserFull
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

/**
 * @param items 
 * @param nextFrom Value for pagination
 * @param profiles 
 * @param groups 
 */
@Serializable
data class MessagesGetHistoryAttachmentsResponse (
    @SerialName("next_from") val nextFrom: String? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("items") val items: List<MessagesHistoryAttachment>? = null,
)

