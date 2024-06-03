package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param url 
 */
@Serializable
data class AdsStatisticClickAction (
    @SerialName("url") val url: String? = null,
    @SerialName("type") val type: String? = null,
)
