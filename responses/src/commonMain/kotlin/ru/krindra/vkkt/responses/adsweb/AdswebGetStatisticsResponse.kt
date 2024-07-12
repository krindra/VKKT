package ru.krindra.vkkt.responses.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.adsweb.*

/**
 * @param nextPageId 
 * @param items 
 */
@Serializable
data class AdswebGetStatisticsResponse (
    @SerialName("next_page_id") val nextPageId: String? = null,
    @SerialName("items") val items: List<AdswebGetStatisticsResponseItemsItem>,
)

