package ru.krindra.vknorthtypes.types.docs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Doc type ID
 * @param name Doc type title
 * @param count Number of docs
 */
@Serializable
data class DocsDocTypes (
    @SerialName("name") val name: String,
    @SerialName("count") val count: Int,
    @SerialName("id") val id: Long,
)
