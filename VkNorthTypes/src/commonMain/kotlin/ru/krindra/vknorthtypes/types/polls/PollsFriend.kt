package ru.krindra.vknorthtypes.types.polls

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 */
@Serializable
data class PollsFriend (
    @SerialName("id") val id: Long,
)
