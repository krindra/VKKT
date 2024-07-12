package ru.krindra.vkkt.responses.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.ads.*

/**
 * @param items Musicians
 */
@Serializable
data class AdsGetMusiciansResponse (
    @SerialName("items") val items: List<AdsMusician>,
)

