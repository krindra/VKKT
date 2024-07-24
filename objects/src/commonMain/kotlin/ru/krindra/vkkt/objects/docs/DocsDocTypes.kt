package ru.krindra.vkkt.objects.docs

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
    @SerialName("id") val id: Int,
    @SerialName("count") val count: Int,
    @SerialName("name") val name: String,
)
