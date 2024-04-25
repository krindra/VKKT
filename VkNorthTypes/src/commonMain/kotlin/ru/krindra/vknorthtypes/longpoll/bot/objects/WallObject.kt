package ru.krindra.vknorthtypes.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WallObject(
    @SerialName("postponed_id") val postponedId: Int? = null,
)