package ru.krindra.vkkt.responses.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.market.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class MarketGetGroupOrdersResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<MarketOrder>,
)

