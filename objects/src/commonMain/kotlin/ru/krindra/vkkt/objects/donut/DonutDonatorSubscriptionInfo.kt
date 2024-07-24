package ru.krindra.vkkt.objects.donut

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Info about user VK Donut subscription
 * 
 * @param ownerId 
 * @param nextPaymentDate 
 * @param amount 
 * @param status 
 */
@Serializable
data class DonutDonatorSubscriptionInfo (
    @SerialName("amount") val amount: Int,
    @SerialName("status") val status: String,
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("next_payment_date") val nextPaymentDate: Int,
)
