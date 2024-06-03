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
data class FriendsGetRequestsNeedMutualResponse (
    @SerialName("count") val count: Int,
    @SerialName("last_viewed") val lastViewed: Int? = null,
    @SerialName("count_unread") val countUnread: Int? = null,
    @SerialName("items") val items: List<FriendsRequestsXtrMutual>,
)

