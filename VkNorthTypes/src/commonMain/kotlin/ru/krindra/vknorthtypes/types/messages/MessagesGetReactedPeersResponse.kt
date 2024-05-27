package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

import ru.krindra.vknorthtypes.types.users.UsersUserFull


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
    @SerialName("reactions") val reactions: List<MessagesReactionResponseItem>,
    @SerialName("counters") val counters: List<MessagesReactionCounterResponseItem>,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
)

