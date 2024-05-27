package ru.krindra.vknorthtypes.types.streaming

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param endpoint Server host
 * @param key Access key
 */
@Serializable
data class StreamingGetServerUrlResponse (
    @SerialName("endpoint") val endpoint: String? = null,
    @SerialName("key") val key: String? = null,
)

