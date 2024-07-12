package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param code Error code
 * @param description Error message
 */
@Serializable
data class BaseMessageError (
    @SerialName("code") val code: Int? = null,
    @SerialName("description") val description: String? = null,
)
