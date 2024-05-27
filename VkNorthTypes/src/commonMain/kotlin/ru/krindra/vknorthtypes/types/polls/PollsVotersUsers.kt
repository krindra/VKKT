package ru.krindra.vknorthtypes.types.polls

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Votes number
 * @param items 
 */
@Serializable
data class PollsVotersUsers (
    @SerialName("count") val count: Int? = null,
    @SerialName("items") val items: List<Int>? = null,
)
