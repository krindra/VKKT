package ru.krindra.vknorthtypes.types.messages

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
