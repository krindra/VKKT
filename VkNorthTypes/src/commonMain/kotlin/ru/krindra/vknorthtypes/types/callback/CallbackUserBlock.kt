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
    @SerialName("comment") val comment: String? = null,
    @SerialName("reason") val reason: Int,
    @SerialName("admin_id") val adminId: Long,
    @SerialName("user_id") val userId: Long,
    @SerialName("unblock_date") val unblockDate: Int,
)
