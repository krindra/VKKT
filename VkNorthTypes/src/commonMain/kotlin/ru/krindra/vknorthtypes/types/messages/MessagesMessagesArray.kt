package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count 
 * @param items 
 */
@Serializable
data class MessagesMessagesArray (
    @SerialName("count") val count: Int? = null,
    @SerialName("items") val items: List<MessagesMessage>? = null,
)
