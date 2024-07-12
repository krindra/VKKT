package ru.krindra.vkkt.responses.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.market.*

/**
 * @param items 
 */
@Serializable
data class MarketGetCategoriesNewResponse (
    @SerialName("items") val items: List<MarketMarketCategoryTree>,
)

