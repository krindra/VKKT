package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Category ID
 * @param name Category name
 * @param isV2 Is v2 category
 * @param parent 
 */
@Serializable
data class MarketMarketCategoryNested (
    @SerialName("name") val name: String,
    @SerialName("is_v2") val isV2: Boolean? = null,
    @SerialName("parent") val parent: MarketMarketCategoryNested? = null,
    @SerialName("id") val id: Long,
)
