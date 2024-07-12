package ru.krindra.vkkt.responses.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.adsweb.*

/**
 * @param count 
 * @param adUnits 
 */
@Serializable
data class AdswebGetAdUnitsResponse (
    @SerialName("count") val count: Int,
    @SerialName("ad_units") val adUnits: List<AdswebGetAdUnitsResponseAdUnitsAdUnit>? = null,
)

