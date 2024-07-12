package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param comment Comment text
 * @param rules 
 */
@Serializable
data class AdsRejectReason (
    @SerialName("comment") val comment: String? = null,
    @SerialName("rules") val rules: List<AdsRules>? = null,
)
