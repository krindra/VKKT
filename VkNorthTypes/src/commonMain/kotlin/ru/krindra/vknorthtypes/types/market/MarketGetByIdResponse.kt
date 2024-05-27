package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class MarketGetByIdResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<MarketMarketItem>,
)

