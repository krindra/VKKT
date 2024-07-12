package ru.krindra.vkkt.responses.orders

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.orders.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class OrdersGetUserSubscriptionsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<OrdersSubscription>,
)

