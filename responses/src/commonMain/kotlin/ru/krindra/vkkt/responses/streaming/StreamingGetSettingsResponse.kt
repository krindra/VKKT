package ru.krindra.vkkt.responses.streaming

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.streaming.*

/**
 * @param monthlyLimit streaming monthly tier
 */
@Serializable
data class StreamingGetSettingsResponse (
    @SerialName("monthly_limit") val monthlyLimit: String? = null,
)

