package ru.krindra.vknorthtypes.types.streaming

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param monthlyLimit streaming monthly tier
 */
@Serializable
data class StreamingGetSettingsResponse (
    @SerialName("monthly_limit") val monthlyLimit: String? = null,
)

