package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Object ID
 * @param name Object name
 */
@Serializable
data class BaseObjectWithName (
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String,
)
