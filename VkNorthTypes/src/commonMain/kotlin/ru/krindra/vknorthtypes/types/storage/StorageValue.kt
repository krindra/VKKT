package ru.krindra.vknorthtypes.types.storage

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param key 
 * @param value 
 */
@Serializable
data class StorageValue (
    @SerialName("value") val value: String,
    @SerialName("key") val key: String,
)
