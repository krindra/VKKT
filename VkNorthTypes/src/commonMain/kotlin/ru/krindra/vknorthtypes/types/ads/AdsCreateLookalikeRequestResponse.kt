package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param requestId Request ID
 */
@Serializable
data class AdsCreateLookalikeRequestResponse (
    @SerialName("request_id") val requestId: Long? = null,
)

