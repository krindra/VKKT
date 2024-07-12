package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Items count
 */
@Serializable
data class BaseObjectCount (
    @SerialName("count") val count: Int? = null,
)
