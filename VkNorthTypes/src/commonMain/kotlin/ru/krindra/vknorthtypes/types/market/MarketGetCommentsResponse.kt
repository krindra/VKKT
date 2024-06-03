package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull
import ru.krindra.vknorthtypes.types.wall.WallWallComment
import ru.krindra.vknorthtypes.types.users.UsersUserFull

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

