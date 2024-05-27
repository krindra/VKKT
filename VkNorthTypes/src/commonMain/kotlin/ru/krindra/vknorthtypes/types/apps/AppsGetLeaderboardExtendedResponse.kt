package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUser


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

