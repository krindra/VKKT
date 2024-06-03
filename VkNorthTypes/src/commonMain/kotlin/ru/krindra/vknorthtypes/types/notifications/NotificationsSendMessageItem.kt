package ru.krindra.vknorthtypes.types.notifications

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param userId User ID
 * @param status Notification status
 * @param error 
 */
@Serializable
data class NotificationsSendMessageItem (
    @SerialName("user_id") val userId: Long? = null,
    @SerialName("status") val status: Boolean? = null,
    @SerialName("error") val error: NotificationsSendMessageError? = null,
)
