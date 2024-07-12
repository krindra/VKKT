package ru.krindra.vkkt.responses.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.ads.*

/**
 * @param requestId Request ID
 */
@Serializable
data class AdsCreateLookalikeRequestResponse (
    @SerialName("request_id") val requestId: Long? = null,
)

