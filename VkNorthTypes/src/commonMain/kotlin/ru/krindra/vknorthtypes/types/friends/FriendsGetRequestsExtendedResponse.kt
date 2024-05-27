package ru.krindra.vknorthtypes.types.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total requests number
 * @param items 
 * @param countUnread Total unread requests number
 * @param lastViewed Friend requests last viewed timestamp
 */
@Serializable
data class FriendsGetRequestsExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<FriendsRequestsXtrMessage>,
    @SerialName("count_unread") val countUnread: Int? = null,
    @SerialName("last_viewed") val lastViewed: Int? = null,
)

