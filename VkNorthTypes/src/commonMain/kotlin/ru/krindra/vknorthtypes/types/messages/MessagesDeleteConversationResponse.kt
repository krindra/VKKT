package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param lastDeletedId Id of the last message, that was deleted
 */
@Serializable
data class MessagesDeleteConversationResponse (
    @SerialName("last_deleted_id") val lastDeletedId: Long,
)

