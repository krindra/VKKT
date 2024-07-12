package ru.krindra.vkkt.objects.market

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
    @SerialName("type") val type: String? = null,
    @SerialName("selected") val selected: Boolean? = null,
    @SerialName("root_path") val rootPath: List<String>? = null,
)
