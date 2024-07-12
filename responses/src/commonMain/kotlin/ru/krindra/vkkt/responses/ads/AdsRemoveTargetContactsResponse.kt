package ru.krindra.vkkt.responses.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.ads.*

/**
 * @param result Operation result
 */
@Serializable
data class AdsRemoveTargetContactsResponse (
    @SerialName("result") val result: Int,
)

