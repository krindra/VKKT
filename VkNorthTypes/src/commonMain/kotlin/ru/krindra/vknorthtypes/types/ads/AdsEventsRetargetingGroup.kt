package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param value 
 */
@Serializable
data class AdsEventsRetargetingGroup (
    @SerialName("id") val id: Long? = null,
    @SerialName("value") val value: List<Int>? = null,
)
