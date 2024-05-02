package ru.krindra.vknorthtypes.longpoll.bot.events.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.messages.MessagesMessage

@Serializable
data class MessageNewObject(
    @SerialName("message") val message: MessagesMessage,
    @SerialName("client_info") val clientInfo: ru.krindra.vknorthtypes.longpoll.bot.events.objects.ClientInfoObject,
)