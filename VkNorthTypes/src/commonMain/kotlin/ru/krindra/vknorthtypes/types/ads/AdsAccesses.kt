package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param clientId Client ID
 * @param role 
 */
@Serializable
data class AdsAccesses (
    @SerialName("role") val role: AdsAccessRole? = null,
    @SerialName("client_id") val clientId: String? = null,
)
