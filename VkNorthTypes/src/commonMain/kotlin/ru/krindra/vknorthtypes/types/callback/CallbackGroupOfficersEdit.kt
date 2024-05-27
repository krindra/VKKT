package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param adminId 
 * @param userId 
 * @param levelOld 
 * @param levelNew 
 */
@Serializable
data class CallbackGroupOfficersEdit (
    @SerialName("admin_id") val adminId: Long,
    @SerialName("user_id") val userId: Long,
    @SerialName("level_old") val levelOld: CallbackGroupOfficerRole,
    @SerialName("level_new") val levelNew: CallbackGroupOfficerRole,
)
