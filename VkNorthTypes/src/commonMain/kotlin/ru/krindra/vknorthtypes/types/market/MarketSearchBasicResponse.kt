package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Current chunk size
 * @param total Total size
 * @param hasMore Next chunk present
 * @param items 
 */
@Serializable
data class MarketSearchBasicResponse (
    @SerialName("count") val count: Int,
    @SerialName("total") val total: Int,
    @SerialName("has_more") val hasMore: Boolean? = null,
    @SerialName("items") val items: List<MarketMarketItemBasicWithGroup>,
)

