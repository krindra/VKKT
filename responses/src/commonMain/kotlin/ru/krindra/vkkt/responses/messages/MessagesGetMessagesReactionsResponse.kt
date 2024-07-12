package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.messages.*

/**
 * @param items 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class MessagesGetMessagesReactionsResponse (
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("items") val items: List<MessagesReactionCountersResponseItem>,
)

