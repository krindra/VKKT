package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersSubscriptionsItem

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class NewsfeedGetSuggestedSourcesResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<UsersSubscriptionsItem>,
)

