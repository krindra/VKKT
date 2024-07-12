package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.messages.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class MessagesSearchResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<MessagesMessage>,
)

