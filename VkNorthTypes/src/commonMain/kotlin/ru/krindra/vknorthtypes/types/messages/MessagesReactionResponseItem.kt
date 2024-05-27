package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 * @param reactionId 
 */
@Serializable
data class MessagesReactionResponseItem (
    @SerialName("user_id") val userId: Long,
    @SerialName("reaction_id") val reactionId: Long,
)
