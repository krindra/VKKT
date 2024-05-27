package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param marketItemId Item ID
 */
@Serializable
data class MarketAddResponse (
    @SerialName("market_item_id") val marketItemId: Long,
)

