package ru.krindra.vkkt.objects.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param visible Whether you can see real online status of user or not
 * @param lastSeen Last time we saw user being active
 * @param isOnline Whether user is currently online or not
 * @param appId Application id from which user is currently online or was last seen online
 * @param isMobile Is user online from desktop app or mobile app
 * @param status In case user online is not visible, it indicates approximate timeframe of user online
 */
@Serializable
data class UsersOnlineInfo (
    @SerialName("visible") val visible: Boolean,
    @SerialName("app_id") val appId: Int? = null,
    @SerialName("status") val status: String? = null,
    @SerialName("last_seen") val lastSeen: Int? = null,
    @SerialName("is_mobile") val isMobile: Boolean? = null,
    @SerialName("is_online") val isOnline: Boolean? = null,
)
