package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param code Error code
 * @param description Error message
 */
@Serializable
data class BaseMessageError (
    @SerialName("description") val description: String? = null,
    @SerialName("code") val code: Int? = null,
)
