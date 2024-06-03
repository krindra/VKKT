package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserFull
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

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

