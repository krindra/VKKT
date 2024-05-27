package ru.krindra.vknorthtypes.types.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Region ID
 * @param title Region title
 */
@Serializable
data class DatabaseRegion (
    @SerialName("title") val title: String? = null,
    @SerialName("id") val id: Long? = null,
)
