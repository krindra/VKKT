package ru.krindra.vkkt.objects.notifications

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param date Date when the reply has been created in Unixtime
 * @param id Reply ID
 * @param text Reply text
 */
@Serializable
data class NotificationsReply (
    @SerialName("id") val id: Int? = null,
    @SerialName("date") val date: Int? = null,
    @SerialName("text") val text: Int? = null,
)
