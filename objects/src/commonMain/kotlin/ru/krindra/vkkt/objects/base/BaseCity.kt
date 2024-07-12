package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id City ID
 * @param title City title
 */
@Serializable
data class BaseCity (
    @SerialName("id") val id: Long,
    @SerialName("title") val title: String,
)
