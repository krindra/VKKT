package ru.krindra.vknorthtypes.types.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param nextPageId 
 * @param items 
 */
@Serializable
data class AdswebGetStatisticsResponse (
    @SerialName("next_page_id") val nextPageId: String? = null,
    @SerialName("items") val items: List<AdswebGetStatisticsResponseItemsItem>,
)

