package ru.krindra.vknorthtypes.types.orders

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class OrdersGetUserSubscriptionsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<OrdersSubscription>,
)

