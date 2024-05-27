package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Total number
 * @param items 
 */
@Serializable
data class MessagesLongpollMessages (
    @SerialName("count") val count: Int? = null,
    @SerialName("items") val items: List<MessagesMessage>? = null,
)
