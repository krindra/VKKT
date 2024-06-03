package ru.krindra.vknorthtypes.types.notifications

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
    @SerialName("id") val id: Long? = null,
    @SerialName("date") val date: Int? = null,
    @SerialName("text") val text: Int? = null,
)
