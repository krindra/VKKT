package ru.krindra.vknorthtypes.types.ads

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
    @SerialName("type") val type: AdsOrdClientType,
    @SerialName("phone") val phone: String,
    @SerialName("name") val name: String,
    @SerialName("inn") val inn: String? = null,
)
