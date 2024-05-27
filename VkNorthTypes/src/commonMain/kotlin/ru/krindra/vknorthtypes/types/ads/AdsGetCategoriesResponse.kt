package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param v1 Old categories
 * @param v2 Actual categories
 */
@Serializable
data class AdsGetCategoriesResponse (
    @SerialName("v1") val v1: List<AdsCategory>? = null,
    @SerialName("v2") val v2: List<AdsCategory>? = null,
)

