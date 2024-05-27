package ru.krindra.vknorthtypes.types.friends

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
    @SerialName("friend_status") val friendStatus: FriendsFriendStatusStatus,
    @SerialName("user_id") val userId: Long,
    @SerialName("sign") val sign: String? = null,
)
