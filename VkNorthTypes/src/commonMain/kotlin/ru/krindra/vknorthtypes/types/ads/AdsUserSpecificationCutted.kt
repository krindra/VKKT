package ru.krindra.vknorthtypes.types.ads

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
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
    @SerialName("client_id") val clientId: Long? = null,
    @SerialName("user_id") val userId: Long,
    @SerialName("view_budget") val viewBudget: Boolean? = null,
    @SerialName("role") val role: AdsAccessRolePublic,
)