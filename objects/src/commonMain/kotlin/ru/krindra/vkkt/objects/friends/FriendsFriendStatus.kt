package ru.krindra.vkkt.objects.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param friendStatus 
 * @param sign MD5 hash for the result validation
 * @param userId User ID
 */
@Serializable
data class FriendsFriendStatus (
    @SerialName("user_id") val userId: Int,
    @SerialName("sign") val sign: String? = null,
    @SerialName("friend_status") val friendStatus: FriendsFriendStatusStatus,
)
