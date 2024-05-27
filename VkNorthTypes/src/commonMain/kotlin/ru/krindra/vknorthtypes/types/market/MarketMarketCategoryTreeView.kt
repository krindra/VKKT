package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param selected 
 * @param rootPath 
 */
@Serializable
data class MarketMarketCategoryTreeView (
    @SerialName("selected") val selected: Boolean? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("root_path") val rootPath: List<String>? = null,
)
