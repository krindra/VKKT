package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total count of found lookalike requests
 * @param items found lookalike requests
 */
@Serializable
data class AdsGetLookalikeRequestsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<AdsLookalikeRequest>,
)

