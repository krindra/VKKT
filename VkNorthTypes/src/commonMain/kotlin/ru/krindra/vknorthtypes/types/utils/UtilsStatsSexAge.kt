package ru.krindra.vknorthtypes.types.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param ageRange Age denotation
 * @param female  Views by female users
 * @param male  Views by male users
 */
@Serializable
data class UtilsStatsSexAge (
    @SerialName("male") val male: Int? = null,
    @SerialName("female") val female: Int? = null,
    @SerialName("age_range") val ageRange: String? = null,
)
