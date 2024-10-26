package ru.krindra.vkkt.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DonutMoneyWithdrawErrorObject(
    @SerialName("reason") val reason: String,
)