package ru.krindra.vknorthtypes.types.polls

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param answerId Answer ID
 * @param users 
 * @param answerOffset Answer offset
 */
@Serializable
data class PollsFieldsVoters (
    @SerialName("answer_offset") val answerOffset: String? = null,
    @SerialName("users") val users: PollsVotersFieldsUsers? = null,
    @SerialName("answer_id") val answerId: Long? = null,
)
