package ru.krindra.vknorthtypes.types.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param statusUser 
 * @param statusModer 
 * @param domains 
 */
@Serializable
data class AdswebGetSitesResponseSitesSite (
    @SerialName("id") val id: Long,
    @SerialName("domains") val domains: String? = null,
    @SerialName("status_user") val statusUser: String? = null,
    @SerialName("status_moder") val statusModer: String? = null,
)
