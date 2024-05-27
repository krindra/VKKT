package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param items Musicians
 */
@Serializable
data class AdsGetMusiciansResponse (
    @SerialName("items") val items: List<AdsMusician>,
)

