package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param id Group ID
 */
@Serializable
data class AdsShareTargetGroupResponse (
    @SerialName("id") val id: Long,
)

