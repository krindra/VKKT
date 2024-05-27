package ru.krindra.vknorthtypes.types.polls

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Answer ID
 * @param rate Answer rate in percents
 * @param text Answer text
 * @param votes Votes number
 */
@Serializable
data class PollsAnswer (
    @SerialName("votes") val votes: Int,
    @SerialName("text") val text: String,
    @SerialName("rate") val rate: Double,
    @SerialName("id") val id: Long,
)
