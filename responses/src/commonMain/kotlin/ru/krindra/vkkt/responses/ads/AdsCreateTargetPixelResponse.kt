package ru.krindra.vkkt.responses.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.ads.*

/**
 * @param id Pixel ID
 * @param pixel Pixel code
 */
@Serializable
data class AdsCreateTargetPixelResponse (
    @SerialName("id") val id: Int? = null,
    @SerialName("pixel") val pixel: String? = null,
)

