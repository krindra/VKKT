package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param items 
 */
@Serializable
data class MarketGetCategoriesNewResponse (
    @SerialName("items") val items: List<MarketMarketCategoryTree>,
)

