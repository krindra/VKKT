package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param amount 
 * @param amountWithoutFee 
 */
@Serializable
data class CallbackDonutMoneyWithdraw (
    @SerialName("amount") val amount: Double,
    @SerialName("amount_without_fee") val amountWithoutFee: Double,
)
