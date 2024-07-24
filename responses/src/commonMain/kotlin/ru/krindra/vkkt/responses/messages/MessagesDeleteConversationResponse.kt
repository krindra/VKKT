package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.messages.*

/**
 * @param lastDeletedId Id of the last message, that was deleted
 */
@Serializable
data class MessagesDeleteConversationResponse (
    @SerialName("last_deleted_id") val lastDeletedId: Int,
)

