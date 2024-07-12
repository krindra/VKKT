package ru.krindra.vkkt.responses.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.newsfeed.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class NewsfeedGetListsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<NewsfeedList>,
)

