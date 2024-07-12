package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param reason 
 */
@Serializable
data class CallbackDonutMoneyWithdrawError (
    @SerialName("reason") val reason: String,
)
