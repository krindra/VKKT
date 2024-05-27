package ru.krindra.vknorthtypes.types.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param title 
 * @param photoUrl 
 * @param access 
 * @param status 
 * @param licenceStatusText 
 */
@Serializable
data class BugtrackerCompanyMemberProduct (
    @SerialName("photo_url") val photoUrl: String? = null,
    @SerialName("id") val id: Long,
    @SerialName("status") val status: Int,
    @SerialName("licence_status_text") val licenceStatusText: String? = null,
    @SerialName("access") val access: Int,
    @SerialName("title") val title: String? = null,
)
