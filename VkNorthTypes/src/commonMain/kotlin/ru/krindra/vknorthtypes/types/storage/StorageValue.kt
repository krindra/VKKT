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
    @SerialName("key") val key: String,
    @SerialName("value") val value: String,
)
