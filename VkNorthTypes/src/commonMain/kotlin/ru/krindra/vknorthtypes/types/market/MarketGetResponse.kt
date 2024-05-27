package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 * @param variants 
 */
@Serializable
data class MarketGetResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<MarketMarketItem>,
    @SerialName("variants") val variants: List<MarketMarketItem>? = null,
)

