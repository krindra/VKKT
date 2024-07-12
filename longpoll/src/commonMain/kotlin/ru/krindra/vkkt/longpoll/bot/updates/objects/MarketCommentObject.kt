package ru.krindra.vkkt.longpoll.bot.updates.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarketCommentObject(
    @SerialName("market_owner_id") val marketOwnerId: Int,
    @SerialName("item_id") val itemId: Int,
)