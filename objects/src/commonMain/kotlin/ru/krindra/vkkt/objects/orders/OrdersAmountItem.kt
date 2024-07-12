package ru.krindra.vkkt.objects.orders

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param amount Votes amount in user's currency
 * @param description Amount description
 * @param votes Votes number
 */
@Serializable
data class OrdersAmountItem (
    @SerialName("votes") val votes: String? = null,
    @SerialName("amount") val amount: Double? = null,
    @SerialName("description") val description: String? = null,
)
