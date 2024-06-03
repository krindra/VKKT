package ru.krindra.vknorthtypes.types.secure

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param appId Application ID
 * @param date Date when message has been sent in Unixtime
 * @param id Notification ID
 * @param message Messsage text
 * @param userId User ID
 */
@Serializable
data class SecureSmsNotification (
    @SerialName("id") val id: String? = null,
    @SerialName("date") val date: String? = null,
    @SerialName("app_id") val appId: String? = null,
    @SerialName("user_id") val userId: String? = null,
    @SerialName("message") val message: String? = null,
)
