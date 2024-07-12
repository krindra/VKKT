package ru.krindra.vkkt.responses.board

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.polls.PollsPoll
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.board.*

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

