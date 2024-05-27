package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.market.MarketPrice

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
    @SerialName("distance") val distance: Int? = null,
    @SerialName("category") val category: BaseLinkProductCategory? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("status") val status: BaseLinkProductStatus? = null,
    @SerialName("city") val city: String? = null,
    @SerialName("orders_count") val ordersCount: Int? = null,
    @SerialName("price") val price: MarketPrice,
    @SerialName("merchant") val merchant: String? = null,
    @SerialName("geo") val geo: BaseGeoCoordinates? = null,
)
