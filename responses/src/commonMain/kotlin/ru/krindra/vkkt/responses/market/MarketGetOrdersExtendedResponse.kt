package ru.krindra.vkkt.responses.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.market.*

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

