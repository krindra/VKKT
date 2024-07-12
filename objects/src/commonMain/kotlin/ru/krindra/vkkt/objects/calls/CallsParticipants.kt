package ru.krindra.vkkt.objects.calls

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param list 
 * @param count Participants count
 */
@Serializable
data class CallsParticipants (
    @SerialName("count") val count: Int? = null,
    @SerialName("list") val list: List<Int>? = null,
)
