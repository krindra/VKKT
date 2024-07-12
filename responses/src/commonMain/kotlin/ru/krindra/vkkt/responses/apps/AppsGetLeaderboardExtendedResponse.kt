package ru.krindra.vkkt.responses.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUser
import ru.krindra.vkkt.objects.apps.*

/**
 * @param count Total number
 * @param items 
 * @param profiles 
 */
@Serializable
data class AppsGetLeaderboardExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<AppsLeaderboard>,
    @SerialName("profiles") val profiles: List<UsersUser>? = null,
)

