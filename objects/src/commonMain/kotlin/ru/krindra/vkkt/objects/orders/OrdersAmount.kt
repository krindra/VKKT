package ru.krindra.vkkt.objects.orders

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param amounts 
 * @param currency Currency name
 */
@Serializable
data class OrdersAmount (
    @SerialName("currency") val currency: String? = null,
    @SerialName("amounts") val amounts: List<OrdersAmountItem>? = null,
)
