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
    @SerialName("user_id") val userId: Int,
    @SerialName("group_id") val groupId: Int,
)
