package ru.krindra.vkkt.responses.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.*

/**
 * @param minutes Estimated time of answer (for status = answer_mark)
 * @param status 
 */
@Serializable
data class GroupsGetOnlineStatusResponse (
    @SerialName("minutes") val minutes: Int? = null,
    @SerialName("status") val status: GroupsOnlineStatusType,
)

