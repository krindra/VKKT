package ru.krindra.vkkt.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DonutMoneyWithdrawObject(
    @SerialName("amount") val amount: Float,
    @SerialName("amount_without_fee") val amountWithoutFee: Float,
)