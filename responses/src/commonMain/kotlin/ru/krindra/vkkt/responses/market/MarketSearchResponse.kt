package ru.krindra.vkkt.responses.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.market.*

/**
 * @param count Total number
 * @param viewType 
 * @param items 
 * @param variants 
 * @param groups 
 * @param filters 
 */
@Serializable
data class MarketSearchResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<MarketMarketItem>,
    @SerialName("view_type") val viewType: MarketServicesViewType,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("variants") val variants: List<MarketMarketItem>? = null,
    @SerialName("filters") val filters: MarketGlobalSearchFilters? = null,
)

