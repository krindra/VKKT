package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Current user's role
 * 
 */
@Serializable
enum class AdsAccessRole(val value: String){
    @SerialName("admin") ADMIN("admin"),
    @SerialName("manager") MANAGER("manager"),
    @SerialName("reports") REPORTS("reports"),
}
