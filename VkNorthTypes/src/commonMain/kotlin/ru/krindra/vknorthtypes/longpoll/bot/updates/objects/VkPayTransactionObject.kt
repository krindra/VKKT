package ru.krindra.vknorthtypes.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VkPayTransactionObject(
    @SerialName("from_id") val fromId: Int,
    @SerialName("amount") val amount: Int,
    @SerialName("description") val description: String,
    @SerialName("date") val date: Int,
)