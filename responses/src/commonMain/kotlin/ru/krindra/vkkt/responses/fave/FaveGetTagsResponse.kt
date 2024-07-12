package ru.krindra.vkkt.responses.fave

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.fave.*

/**
 * @param count 
 * @param items 
 */
@Serializable
data class FaveGetTagsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<FaveTag>,
)

