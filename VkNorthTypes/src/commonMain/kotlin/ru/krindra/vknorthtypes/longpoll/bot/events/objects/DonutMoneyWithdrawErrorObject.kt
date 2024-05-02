package ru.krindra.vknorthtypes.longpoll.bot.events.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DonutMoneyWithdrawErrorObject(
    @SerialName("reason") val reason: String,
)