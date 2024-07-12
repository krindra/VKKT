package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param majorId Major id for sorting conversations
 * @param minorId Minor id for sorting conversations
 */
@Serializable
data class MessagesConversationSortId (
    @SerialName("major_id") val majorId: Long,
    @SerialName("minor_id") val minorId: Long,
)
