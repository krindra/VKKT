package ru.krindra.vkkt.responses.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.market.*

/**
 * @param marketItemId Item ID
 */
@Serializable
data class MarketAddResponse (
    @SerialName("market_item_id") val marketItemId: Int,
)

