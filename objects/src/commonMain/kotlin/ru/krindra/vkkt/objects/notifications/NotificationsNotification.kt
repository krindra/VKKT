package ru.krindra.vkkt.objects.notifications

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param date Date when the event has been occurred
 * @param feedback 
 * @param parent 
 * @param reply 
 * @param type Notification type
 */
@Serializable
data class NotificationsNotification (
    @SerialName("date") val date: Int? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("reply") val reply: NotificationsReply? = null,
    @SerialName("feedback") val feedback: NotificationsFeedback? = null,
    @SerialName("parent") val parent: NotificationsNotification? = null,
)
