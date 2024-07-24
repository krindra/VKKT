package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 * @param reactionId 
 */
@Serializable
data class MessagesReactionResponseItem (
    @SerialName("user_id") val userId: Int,
    @SerialName("reaction_id") val reactionId: Int,
)
