package ru.krindra.vkkt.objects.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param commonCount Total mutual friends number
 * @param commonFriends 
 * @param id User ID
 */
@Serializable
data class FriendsMutualFriend (
    @SerialName("id") val id: Int? = null,
    @SerialName("common_count") val commonCount: Int? = null,
    @SerialName("common_friends") val commonFriends: List<Int>? = null,
)
