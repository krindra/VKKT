package ru.krindra.vkkt.objects.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param siteId 
 * @param name 
 */
@Serializable
data class AdswebGetAdUnitsResponseAdUnitsAdUnit (
    @SerialName("id") val id: Int,
    @SerialName("site_id") val siteId: Int,
    @SerialName("name") val name: String? = null,
)
