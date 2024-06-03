package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Object ID
 * @param name Object name
 */
@Serializable
data class BaseObjectWithName (
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
)
