package ru.krindra.vkkt.objects.secure

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param date Date when access_token has been generated in Unixtime
 * @param expire Date when access_token will expire in Unixtime
 * @param success Returns if successfully processed
 * @param userId User ID
 */
@Serializable
data class SecureTokenChecked (
    @SerialName("date") val date: Int? = null,
    @SerialName("expire") val expire: Int? = null,
    @SerialName("user_id") val userId: Int? = null,
    @SerialName("success") val success: Int? = null,
)
