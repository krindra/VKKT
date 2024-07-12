package ru.krindra.vkkt.responses.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.wall.WallWallComment
import ru.krindra.vkkt.objects.market.*

/**
 * @param count Total number
 * @param items 
 * @param profiles List of users, available only if extended=true exists in query params
 * @param groups List of groups, available only if extended=true exists in query params
 */
@Serializable
data class MarketGetCommentsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<WallWallComment>,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)

