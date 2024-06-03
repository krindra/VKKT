package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Object ID
 * @param title Object title
 */
@Serializable
data class BaseObject (
    @SerialName("id") val id: Long,
    @SerialName("title") val title: String,
)
