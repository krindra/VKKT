package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param allowed 
 * @param reason 
 */
@Serializable
data class MessagesConversationCanWrite (
    @SerialName("allowed") val allowed: Boolean,
    @SerialName("reason") val reason: Int? = null,
)
