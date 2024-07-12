package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 * @param role 
 * @param clientId 
 * @param viewBudget 
 */
@Serializable
data class AdsUserSpecificationCutted (
    @SerialName("user_id") val userId: Long,
    @SerialName("role") val role: AdsAccessRolePublic,
    @SerialName("client_id") val clientId: Long? = null,
    @SerialName("view_budget") val viewBudget: Boolean? = null,
)
