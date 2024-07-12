package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Current user's role
 * 
 */
@Serializable
enum class AdsAccessRolePublic(val value: String){
    @SerialName("manager") MANAGER("manager"),
    @SerialName("reports") REPORTS("reports"),
}
