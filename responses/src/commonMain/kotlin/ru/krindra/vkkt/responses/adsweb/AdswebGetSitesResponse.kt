package ru.krindra.vkkt.responses.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.adsweb.*

/**
 * @param count 
 * @param sites 
 */
@Serializable
data class AdswebGetSitesResponse (
    @SerialName("count") val count: Int,
    @SerialName("sites") val sites: List<AdswebGetSitesResponseSitesSite>? = null,
)

