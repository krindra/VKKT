package ru.krindra.vkkt.longpoll.bot.updates

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.longpoll.bot.updates.objects.DonutMoneyWithdrawErrorObject


@Serializable
data class DonutMoneyWithdrawErrorUpdate(
    @SerialName("type") override val type: String,
    @SerialName("event_id") override val eventId: String,
    @SerialName("v") override val v: String,
    @SerialName("group_id") override val groupId: Int,
    @SerialName("object") val `object`: DonutMoneyWithdrawErrorObject,
) : BotLPUpdate() {
    companion object {
        val type = "donut_money_withdraw_error"
    }
}