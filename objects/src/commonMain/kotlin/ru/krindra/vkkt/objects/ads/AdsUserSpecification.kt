package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 * @param role 
 * @param grantAccessToAllClients 
 * @param clientIds 
 * @param viewBudget 
 */
@Serializable
data class AdsUserSpecification (
    @SerialName("user_id") val userId: Long,
    @SerialName("role") val role: AdsAccessRolePublic,
    @SerialName("client_ids") val clientIds: List<Int>? = null,
    @SerialName("view_budget") val viewBudget: Boolean? = null,
    @SerialName("grant_access_to_all_clients") val grantAccessToAllClients: Boolean? = null,
)
