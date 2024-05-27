package ru.krindra.vknorthtypes.types.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count 
 * @param adUnits 
 */
@Serializable
data class AdswebGetAdUnitsResponse (
    @SerialName("count") val count: Int,
    @SerialName("ad_units") val adUnits: List<AdswebGetAdUnitsResponseAdUnitsAdUnit>? = null,
)

