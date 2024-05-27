package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param viewType 
 * @param items 
 * @param variants 
 */
@Serializable
data class MarketSearchExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("view_type") val viewType: MarketServicesViewType,
    @SerialName("items") val items: List<MarketMarketItemFull>,
    @SerialName("variants") val variants: List<MarketMarketItemFull>? = null,
)

