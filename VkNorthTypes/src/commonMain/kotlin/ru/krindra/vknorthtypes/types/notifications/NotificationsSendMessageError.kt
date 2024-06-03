package ru.krindra.vknorthtypes.types.notifications

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param code Error code
 * @param description Error description
 */
@Serializable
data class NotificationsSendMessageError (
    @SerialName("code") val code: Int? = null,
    @SerialName("description") val description: String? = null,
)
