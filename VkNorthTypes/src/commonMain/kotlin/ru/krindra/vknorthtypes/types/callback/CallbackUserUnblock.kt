package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param adminId 
 * @param userId 
 * @param byEndDate 
 */
@Serializable
data class CallbackUserUnblock (
    @SerialName("admin_id") val adminId: Long,
    @SerialName("user_id") val userId: Long,
    @SerialName("by_end_date") val byEndDate: Int,
)
