package ru.krindra.vknorthtypes.types.orders

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param amount Amount
 * @param appOrderId App order ID
 * @param cancelTransactionId Cancel transaction ID
 * @param date Date of creation in Unixtime
 * @param id Order ID
 * @param item Order item
 * @param receiverId Receiver ID
 * @param status Order status
 * @param transactionId Transaction ID
 * @param userId User ID
 */
@Serializable
data class OrdersOrder (
    @SerialName("id") val id: String,
    @SerialName("cancel_transaction_id") val cancelTransactionId: String? = null,
    @SerialName("app_order_id") val appOrderId: String,
    @SerialName("user_id") val userId: String,
    @SerialName("status") val status: String,
    @SerialName("transaction_id") val transactionId: String? = null,
    @SerialName("amount") val amount: String,
    @SerialName("date") val date: String,
    @SerialName("receiver_id") val receiverId: String,
    @SerialName("item") val item: String,
)
