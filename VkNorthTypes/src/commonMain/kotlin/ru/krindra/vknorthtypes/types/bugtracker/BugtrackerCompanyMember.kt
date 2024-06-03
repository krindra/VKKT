package ru.krindra.vknorthtypes.types.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId 
 * @param companyId 
 * @param role 
 * @param roleName 
 * @param ts 
 * @param groupsCount 
 * @param productsCount 
 * @param reporterUrl 
 * @param groups 
 * @param products 
 */
@Serializable
data class BugtrackerCompanyMember (
    @SerialName("ts") val ts: Int,
    @SerialName("role") val role: Int,
    @SerialName("user_id") val userId: Long,
    @SerialName("company_id") val companyId: Long,
    @SerialName("role_name") val roleName: String,
    @SerialName("groups_count") val groupsCount: Int,
    @SerialName("groups") val groups: List<Int>? = null,
    @SerialName("reporter_url") val reporterUrl: String,
    @SerialName("products_count") val productsCount: Int,
    @SerialName("products") val products: List<BugtrackerCompanyMemberProduct>? = null,
)
