package ru.krindra.vkkt.objects.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Region ID
 * @param title Region title
 */
@Serializable
data class DatabaseRegion (
    @SerialName("id") val id: Int? = null,
    @SerialName("title") val title: String? = null,
)
