package ru.krindra.vknorthtypes.types.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param key Link key (characters after vk.cc/)
 * @param stats 
 */
@Serializable
data class UtilsLinkStatsExtended (
    @SerialName("stats") val stats: List<UtilsStatsExtended>? = null,
    @SerialName("key") val key: String? = null,
)
