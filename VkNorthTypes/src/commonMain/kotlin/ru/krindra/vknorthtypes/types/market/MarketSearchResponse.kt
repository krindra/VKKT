package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

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

