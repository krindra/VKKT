package ru.krindra.vkkt.objects.callback

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
    @SerialName("user_id") val userId: Int,
    @SerialName("admin_id") val adminId: Int,
    @SerialName("level_new") val levelNew: CallbackGroupOfficerRole,
    @SerialName("level_old") val levelOld: CallbackGroupOfficerRole,
)
