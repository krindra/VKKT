package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total friends number
 * @param items 
 */
@Serializable
data class UsersGetFollowersResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<Int>,
)

