package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param cmid 
 * @param counters 
 */
@Serializable
data class MessagesReactionCountersResponseItem (
    @SerialName("cmid") val cmid: Long,
    @SerialName("counters") val counters: List<MessagesReactionCounterResponseItem>,
)
