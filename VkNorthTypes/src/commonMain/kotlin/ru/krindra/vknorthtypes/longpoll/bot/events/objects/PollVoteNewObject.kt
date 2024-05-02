package ru.krindra.vknorthtypes.longpoll.bot.events.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PollVoteNewObject(
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("poll_id") val pollId: Int,
    @SerialName("option_id") val optionId: Int,
    @SerialName("user_id") val userId: Int,
)