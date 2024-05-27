package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt
import ru.krindra.vknorthtypes.types.base.BaseMessageError

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
    @SerialName("conversation_message_id") val conversationMessageId: Long? = null,
    @SerialName("message_id") val messageId: Long? = null,
    @SerialName("peer_id") val peerId: Long? = null,
    @SerialName("error") val error: BaseMessageError? = null,
    @SerialName("response") val response: BaseBoolInt? = null,
)
