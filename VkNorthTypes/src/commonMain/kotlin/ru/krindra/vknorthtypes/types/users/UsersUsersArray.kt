package ru.krindra.vknorthtypes.types.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Users number
 * @param items 
 */
@Serializable
data class UsersUsersArray (
    @SerialName("items") val items: List<Int>,
    @SerialName("count") val count: Int,
)
