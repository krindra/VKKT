package ru.krindra.vkkt.objects.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param skype User's Skype nickname
 * @param facebook User's Facebook account
 * @param facebookName User's Facebook name
 * @param twitter User's Twitter account
 * @param livejournal User's Livejournal account
 * @param instagram User's Instagram account
 */
@Serializable
data class UsersUserConnections (
    @SerialName("skype") val skype: String,
    @SerialName("twitter") val twitter: String,
    @SerialName("facebook") val facebook: String,
    @SerialName("instagram") val instagram: String,
    @SerialName("livejournal") val livejournal: String? = null,
    @SerialName("facebook_name") val facebookName: String? = null,
)
