package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.market.MarketPrice

/**
 *
 * @param price 
 * @param merchant 
 * @param category 
 * @param geo 
 * @param distance 
 * @param city 
 * @param status 
 * @param ordersCount 
 * @param type 
 */
@Serializable
data class BaseLinkProduct (
    @SerialName("price") val price: MarketPrice,
    @SerialName("city") val city: String? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("distance") val distance: Int? = null,
    @SerialName("merchant") val merchant: String? = null,
    @SerialName("geo") val geo: BaseGeoCoordinates? = null,
    @SerialName("orders_count") val ordersCount: Int? = null,
    @SerialName("status") val status: BaseLinkProductStatus? = null,
    @SerialName("category") val category: BaseLinkProductCategory? = null,
)
