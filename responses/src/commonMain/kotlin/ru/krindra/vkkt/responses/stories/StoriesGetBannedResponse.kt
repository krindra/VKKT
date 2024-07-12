package ru.krindra.vkkt.responses.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.stories.*

/**
 * @param count Stories count
 * @param items 
 */
@Serializable
data class StoriesGetBannedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<Int>,
)

