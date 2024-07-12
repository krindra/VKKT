package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param key Parameter name
 * @param value Parameter value
 */
@Serializable
data class BaseRequestParam (
    @SerialName("key") val key: String,
    @SerialName("value") val value: String,
)
