package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.base.BaseMessageError

/**
 *
 * @param peerId 
 * @param messageId 
 * @param conversationMessageId 
 * @param response 
 * @param error 
 */
@Serializable
data class MessagesDeleteFullResponseItem (
    @SerialName("peer_id") val peerId: Int? = null,
    @SerialName("message_id") val messageId: Int? = null,
    @SerialName("error") val error: BaseMessageError? = null,
    @SerialName("response") val response: BaseBoolInt? = null,
    @SerialName("conversation_message_id") val conversationMessageId: Int? = null,
)
