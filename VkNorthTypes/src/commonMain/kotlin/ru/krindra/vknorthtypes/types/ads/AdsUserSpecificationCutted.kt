package ru.krindra.vknorthtypes.types.ads

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
    @SerialName("view_budget") val viewBudget: Boolean? = null,
    @SerialName("role") val role: AdsAccessRolePublic,
    @SerialName("user_id") val userId: Long,
    @SerialName("client_id") val clientId: Long? = null,
)
