package ru.krindra.vknorthtypes.types.adsweb

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
    @SerialName("name") val name: String? = null,
    @SerialName("site_id") val siteId: Long,
    @SerialName("id") val id: Long,
)
