package ru.krindra.vknorthtypes.types.users

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
    @SerialName("instagram") val instagram: String,
    @SerialName("facebook_name") val facebookName: String? = null,
    @SerialName("livejournal") val livejournal: String? = null,
    @SerialName("twitter") val twitter: String,
    @SerialName("skype") val skype: String,
    @SerialName("facebook") val facebook: String,
)
