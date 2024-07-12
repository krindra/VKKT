package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.messages.*

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

