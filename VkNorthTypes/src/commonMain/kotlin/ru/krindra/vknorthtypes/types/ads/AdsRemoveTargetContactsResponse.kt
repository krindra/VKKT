package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param result Operation result
 */
@Serializable
data class AdsRemoveTargetContactsResponse (
    @SerialName("result") val result: Int,
)

