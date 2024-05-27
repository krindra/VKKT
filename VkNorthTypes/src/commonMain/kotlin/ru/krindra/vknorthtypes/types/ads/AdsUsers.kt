package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param accesses 
 * @param userId User ID
 */
@Serializable
data class AdsUsers (
    @SerialName("accesses") val accesses: List<AdsAccesses>,
    @SerialName("user_id") val userId: Long,
)
