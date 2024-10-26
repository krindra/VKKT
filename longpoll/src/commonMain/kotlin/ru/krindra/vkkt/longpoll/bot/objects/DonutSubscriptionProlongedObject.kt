package ru.krindra.vkkt.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class DonutSubscriptionProlongedObject(
    @SerialName("amount") val amount: Int,
    @SerialName("amount_without_fee") val amountWithoutFee: Float,
    @SerialName("user_id") val userId: Int,
)

