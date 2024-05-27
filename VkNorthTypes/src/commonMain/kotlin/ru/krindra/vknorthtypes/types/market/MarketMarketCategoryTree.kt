package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Category ID
 * @param name Category name
 * @param iconName Icon name
 * @param children 
 * @param view 
 * @param url SEO-friendly URL to page with category's items
 */
@Serializable
data class MarketMarketCategoryTree (
    @SerialName("id") val id: Long,
    @SerialName("icon_name") val iconName: String? = null,
    @SerialName("name") val name: String,
    @SerialName("view") val view: MarketMarketCategoryTreeView? = null,
    @SerialName("children") val children: List<MarketMarketCategoryTree>? = null,
    @SerialName("url") val url: String? = null,
)
