package ru.krindra.vkkt.responses.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.ads.*

/**
 * @param count Total count of found lookalike requests
 * @param items found lookalike requests
 */
@Serializable
data class AdsGetLookalikeRequestsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<AdsLookalikeRequest>,
)

