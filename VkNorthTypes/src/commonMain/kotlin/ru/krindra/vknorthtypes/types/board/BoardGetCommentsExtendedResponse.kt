package ru.krindra.vknorthtypes.types.board

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserFull
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull
import ru.krindra.vknorthtypes.types.polls.PollsPoll

/**
 * @param count Total number
 * @param items 
 * @param poll 
 * @param profiles 
 * @param groups 
 * @param realOffset Offset of comment
 */
@Serializable
data class BoardGetCommentsExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("poll") val poll: PollsPoll? = null,
    @SerialName("real_offset") val realOffset: Int? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>,
    @SerialName("items") val items: List<BoardTopicComment>,
    @SerialName("profiles") val profiles: List<UsersUserFull>,
)

