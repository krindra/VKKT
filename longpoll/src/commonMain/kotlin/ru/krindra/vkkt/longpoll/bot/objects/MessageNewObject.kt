package ru.krindra.vkkt.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.messages.MessagesMessage

@Serializable
data class MessageNewObject(
    @SerialName("message") val message: MessagesMessage,
    @SerialName("client_info") val clientInfo: ru.krindra.vkkt.longpoll.bot.objects.ClientInfoObject,
)