package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param adminId 
 * @param userId 
 * @param unblockDate 
 * @param reason 
 * @param comment 
 */
@Serializable
data class CallbackUserBlock (
    @SerialName("reason") val reason: Int,
    @SerialName("user_id") val userId: Long,
    @SerialName("admin_id") val adminId: Long,
    @SerialName("unblock_date") val unblockDate: Int,
    @SerialName("comment") val comment: String? = null,
)
