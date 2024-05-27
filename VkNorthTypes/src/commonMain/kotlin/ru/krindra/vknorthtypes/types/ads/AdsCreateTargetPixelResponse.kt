package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param id Pixel ID
 * @param pixel Pixel code
 */
@Serializable
data class AdsCreateTargetPixelResponse (
    @SerialName("id") val id: Long? = null,
    @SerialName("pixel") val pixel: String? = null,
)

