package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param name 
 * @param inn 
 * @param phone 
 */
@Serializable
data class AdsOrdSubagent (
    @SerialName("name") val name: String,
    @SerialName("phone") val phone: String,
    @SerialName("inn") val inn: String? = null,
    @SerialName("type") val type: AdsOrdClientType,
)
