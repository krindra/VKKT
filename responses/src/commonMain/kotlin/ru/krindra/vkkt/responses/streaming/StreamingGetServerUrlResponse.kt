package ru.krindra.vkkt.responses.streaming

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.streaming.*

/**
 * @param endpoint Server host
 * @param key Access key
 */
@Serializable
data class StreamingGetServerUrlResponse (
    @SerialName("key") val key: String? = null,
    @SerialName("endpoint") val endpoint: String? = null,
)

