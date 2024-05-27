package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param reactionId 
 * @param count 
 * @param userIds 
 */
@Serializable
data class MessagesReactionCounterResponseItem (
    @SerialName("user_ids") val userIds: List<Int>,
    @SerialName("count") val count: Int,
    @SerialName("reaction_id") val reactionId: Long,
)
