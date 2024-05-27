package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id City ID
 * @param title City title
 */
@Serializable
data class BaseCity (
    @SerialName("title") val title: String,
    @SerialName("id") val id: Long,
)
