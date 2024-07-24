package ru.krindra.vkkt.objects.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param ownerId 
 * @param pollId 
 * @param optionId 
 * @param userId 
 */
@Serializable
data class CallbackPollVoteNew (
    @SerialName("poll_id") val pollId: Int,
    @SerialName("user_id") val userId: Int,
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("option_id") val optionId: Int,
)
