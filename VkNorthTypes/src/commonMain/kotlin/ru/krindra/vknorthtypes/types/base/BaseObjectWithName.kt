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
    @SerialName("name") val name: String,
    @SerialName("id") val id: Long,
)
