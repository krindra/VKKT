package ru.krindra.vknorthtypes.types.donut

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
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
    @SerialName("next_payment_date") val nextPaymentDate: Int,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("amount") val amount: Int,
    @SerialName("status") val status: String,
)