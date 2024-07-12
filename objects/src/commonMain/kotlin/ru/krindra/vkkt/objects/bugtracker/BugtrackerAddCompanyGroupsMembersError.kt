package ru.krindra.vkkt.objects.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param groupId 
 * @param userId 
 */
@Serializable
data class BugtrackerAddCompanyGroupsMembersError (
    @SerialName("user_id") val userId: Long,
    @SerialName("group_id") val groupId: Long,
)
