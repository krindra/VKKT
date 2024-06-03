package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Country ID
 * @param title Country title
 */
@Serializable
data class BaseCountry (
    @SerialName("id") val id: Long,
    @SerialName("title") val title: String,
)
