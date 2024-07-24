package ru.krindra.vkkt.objects.callback

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
    @SerialName("user_id") val userId: Int,
    @SerialName("admin_id") val adminId: Int,
    @SerialName("unblock_date") val unblockDate: Int,
    @SerialName("comment") val comment: String? = null,
)
