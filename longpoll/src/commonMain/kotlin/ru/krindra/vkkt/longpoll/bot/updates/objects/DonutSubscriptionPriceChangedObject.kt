package ru.krindra.vkkt.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DonutSubscriptionPriceChangedObject(
    @SerialName("amount_old") val amountOld: Int,
    @SerialName("amount_new") val amountNew: Int,
    @SerialName("amount_diff") val amountDiff: Float,
    @SerialName("amount_diff_without_fee") val amountDiffWithoutFee: Float,
    @SerialName("user_id") val userId: Int,
)