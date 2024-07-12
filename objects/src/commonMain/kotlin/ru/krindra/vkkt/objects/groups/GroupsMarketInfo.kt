package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.market.MarketPrice
import ru.krindra.vkkt.objects.market.MarketCurrency
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param type Market type
 * @param contactId Contact person ID
 * @param currency 
 * @param currencyText Currency name
 * @param isShowHeaderItemsLink Shop header items link is enabled
 * @param enabled Information whether the market is enabled
 * @param mainAlbumId Main market album ID
 * @param priceMax Maximum price
 * @param priceMin Minimum price
 * @param minOrderPrice 
 */
@Serializable
data class GroupsMarketInfo (
    @SerialName("type") val type: String? = null,
    @SerialName("contact_id") val contactId: Long? = null,
    @SerialName("price_max") val priceMax: String? = null,
    @SerialName("price_min") val priceMin: String? = null,
    @SerialName("enabled") val enabled: BaseBoolInt? = null,
    @SerialName("main_album_id") val mainAlbumId: Long? = null,
    @SerialName("currency") val currency: MarketCurrency? = null,
    @SerialName("currency_text") val currencyText: String? = null,
    @SerialName("min_order_price") val minOrderPrice: MarketPrice? = null,
    @SerialName("is_show_header_items_link") val isShowHeaderItemsLink: BaseBoolInt? = null,
)
