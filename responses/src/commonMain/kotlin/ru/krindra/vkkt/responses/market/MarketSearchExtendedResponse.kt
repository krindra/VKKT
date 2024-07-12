package ru.krindra.vkkt.responses.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.market.*

/**
 * @param count Total number
 * @param viewType 
 * @param items 
 * @param variants 
 */
@Serializable
data class MarketSearchExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<MarketMarketItemFull>,
    @SerialName("view_type") val viewType: MarketServicesViewType,
    @SerialName("variants") val variants: List<MarketMarketItemFull>? = null,
)

