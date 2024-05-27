package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class NewsfeedGetListsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<NewsfeedList>,
)

