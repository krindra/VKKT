package ru.krindra.vknorthtypes.types.orders

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
    @SerialName("description") val description: String? = null,
    @SerialName("amount") val amount: Double? = null,
    @SerialName("votes") val votes: String? = null,
)
