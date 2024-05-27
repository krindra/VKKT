package ru.krindra.vknorthtypes.types.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number of friends lists
 * @param items 
 */
@Serializable
data class FriendsGetListsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<FriendsFriendsList>,
)

