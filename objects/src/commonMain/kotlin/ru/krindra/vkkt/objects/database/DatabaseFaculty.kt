package ru.krindra.vkkt.objects.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Faculty ID
 * @param title Faculty title
 */
@Serializable
data class DatabaseFaculty (
    @SerialName("id") val id: Long? = null,
    @SerialName("title") val title: String? = null,
)
