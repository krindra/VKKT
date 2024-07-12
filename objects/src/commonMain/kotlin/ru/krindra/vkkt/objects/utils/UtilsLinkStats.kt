package ru.krindra.vkkt.objects.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param key Link key (characters after vk.cc/)
 * @param stats 
 */
@Serializable
data class UtilsLinkStats (
    @SerialName("key") val key: String? = null,
    @SerialName("stats") val stats: List<UtilsStats>? = null,
)
