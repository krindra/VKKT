package ru.krindra.vkkt.objects.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id University ID
 * @param title University title
 */
@Serializable
data class DatabaseUniversity (
    @SerialName("id") val id: Long? = null,
    @SerialName("title") val title: String? = null,
)
