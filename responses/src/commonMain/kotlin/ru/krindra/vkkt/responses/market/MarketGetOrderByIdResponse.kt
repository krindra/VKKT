package ru.krindra.vkkt.responses.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.market.*

/**
 * @param order 
 */
@Serializable
data class MarketGetOrderByIdResponse (
    @SerialName("order") val order: MarketOrder? = null,
)

