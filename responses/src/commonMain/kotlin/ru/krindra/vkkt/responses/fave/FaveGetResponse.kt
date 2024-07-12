package ru.krindra.vkkt.responses.fave

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.fave.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class FaveGetResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<FaveBookmark>,
)

