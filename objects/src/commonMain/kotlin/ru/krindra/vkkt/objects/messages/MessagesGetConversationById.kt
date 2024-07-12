package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Total number
 * @param items 
 */
@Serializable
data class MessagesGetConversationById (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<MessagesConversation>,
)
