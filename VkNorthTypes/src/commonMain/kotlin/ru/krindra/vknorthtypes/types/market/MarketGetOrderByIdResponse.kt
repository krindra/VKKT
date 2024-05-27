package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param order 
 */
@Serializable
data class MarketGetOrderByIdResponse (
    @SerialName("order") val order: MarketOrder? = null,
)

