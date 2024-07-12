package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.messages.*

/**
 * @param count Total number
 * @param reactions 
 * @param counters 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class MessagesGetReactedPeersResponse (
    @SerialName("count") val count: Int,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("reactions") val reactions: List<MessagesReactionResponseItem>,
    @SerialName("counters") val counters: List<MessagesReactionCounterResponseItem>,
)

