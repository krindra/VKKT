package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param key Parameter name
 * @param value Parameter value
 */
@Serializable
data class BaseRequestParam (
    @SerialName("value") val value: String,
    @SerialName("key") val key: String,
)
