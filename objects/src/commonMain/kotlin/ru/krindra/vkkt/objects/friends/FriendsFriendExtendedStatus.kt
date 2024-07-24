package ru.krindra.vkkt.objects.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param isRequestUnread Is friend request from other user unread
 * @param friendStatus 
 * @param sign MD5 hash for the result validation
 * @param userId User ID
 */
@Serializable
data class FriendsFriendExtendedStatus (
    @SerialName("user_id") val userId: Int,
    @SerialName("sign") val sign: String? = null,
    @SerialName("is_request_unread") val isRequestUnread: Boolean? = null,
    @SerialName("friend_status") val friendStatus: FriendsFriendStatusStatus,
)
