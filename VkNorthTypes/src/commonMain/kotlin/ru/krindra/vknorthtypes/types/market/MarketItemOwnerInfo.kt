package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseImage

/**
 *
 * Information about the group where the item is placed
 * 
 * @param avatar Avatar of the group
 * @param name Name of the group
 * @param category Category of the item or description of the group
 * @param categoryUrl Link to the section of the group
 * @param isCorporatedMarket Is the group is VK corporated market
 * @param marketType Type of the market group
 */
@Serializable
data class MarketItemOwnerInfo (
    @SerialName("name") val name: String? = null,
    @SerialName("category") val category: String? = null,
    @SerialName("avatar") val avatar: List<BaseImage>? = null,
    @SerialName("category_url") val categoryUrl: String? = null,
    @SerialName("market_type") val marketType: MarketOwnerType? = null,
    @SerialName("is_corporated_market") val isCorporatedMarket: Boolean? = null,
)
