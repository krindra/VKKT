package ru.krindra.vknorthtypes.types.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id University ID
 * @param title University title
 */
@Serializable
data class DatabaseUniversity (
    @SerialName("title") val title: String? = null,
    @SerialName("id") val id: Long? = null,
)
