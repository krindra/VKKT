package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param key 
 * @param value 
 */
@Serializable
data class AdsMobileStatItem (
    @SerialName("key") val key: String? = null,
    @SerialName("value") val value: Double? = null,
)
