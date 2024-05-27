package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull


/**
 * @param count Total number
 * @param items 
 * @param groups 
 */
@Serializable
data class MarketGetOrdersExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<MarketOrder>,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
)

