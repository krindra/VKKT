package ru.krindra.vknorthtypes.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarketCommentDeleteObject(
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("id") val id: Int,
    @SerialName("user_id") val userId: Int,
    @SerialName("deleter_id") val deleterId: Int,
    @SerialName("item_id") val itemId: Int,
)