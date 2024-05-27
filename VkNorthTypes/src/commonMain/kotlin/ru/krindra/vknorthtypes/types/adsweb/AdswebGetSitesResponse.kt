package ru.krindra.vknorthtypes.types.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count 
 * @param sites 
 */
@Serializable
data class AdswebGetSitesResponse (
    @SerialName("count") val count: Int,
    @SerialName("sites") val sites: List<AdswebGetSitesResponseSitesSite>? = null,
)

