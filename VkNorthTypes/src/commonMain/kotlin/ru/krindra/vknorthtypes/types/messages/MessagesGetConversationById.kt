package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Total number
 * @param items 
 */
@Serializable
data class MessagesGetConversationById (
    @SerialName("items") val items: List<MessagesConversation>,
    @SerialName("count") val count: Int,
)
