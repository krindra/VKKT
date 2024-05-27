package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number of available results
 * @param friendsCount 
 * @param items 
 */
@Serializable
data class UsersGetFollowersFieldsResponse (
    @SerialName("count") val count: Int,
    @SerialName("friends_count") val friendsCount: Int? = null,
    @SerialName("items") val items: List<UsersUserFull>,
)

