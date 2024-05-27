package ru.krindra.vknorthtypes.types.callback

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
    @SerialName("option_id") val optionId: Long,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("user_id") val userId: Long,
    @SerialName("poll_id") val pollId: Long,
)
