package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 * @param amount 
 * @param amountWithoutFee 
 */
@Serializable
data class CallbackDonutSubscriptionCreate (
    @SerialName("amount") val amount: Int,
    @SerialName("user_id") val userId: Long? = null,
    @SerialName("amount_without_fee") val amountWithoutFee: Double,
)
