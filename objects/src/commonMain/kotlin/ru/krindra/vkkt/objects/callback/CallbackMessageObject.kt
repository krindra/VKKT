package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.messages.MessagesMessage
import ru.krindra.vkkt.objects.client.ClientInfoForBots

/**
 *
 * @param clientInfo 
 * @param message 
 */
@Serializable
data class CallbackMessageObject (
    @SerialName("message") val message: MessagesMessage? = null,
    @SerialName("client_info") val clientInfo: ClientInfoForBots? = null,
)
