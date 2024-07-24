package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param accesses 
 * @param userId User ID
 */
@Serializable
data class AdsUsers (
    @SerialName("user_id") val userId: Int,
    @SerialName("accesses") val accesses: List<AdsAccesses>,
)
