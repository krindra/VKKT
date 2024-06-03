package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.client.ClientInfoForBots
import ru.krindra.vknorthtypes.types.messages.MessagesMessage

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
