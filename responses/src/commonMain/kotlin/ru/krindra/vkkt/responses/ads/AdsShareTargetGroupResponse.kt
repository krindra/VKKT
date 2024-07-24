package ru.krindra.vkkt.responses.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.ads.*

/**
 * @param id Group ID
 */
@Serializable
data class AdsShareTargetGroupResponse (
    @SerialName("id") val id: Int,
)

