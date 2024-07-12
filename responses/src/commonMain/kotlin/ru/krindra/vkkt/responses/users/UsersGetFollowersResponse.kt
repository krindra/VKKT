package ru.krindra.vkkt.responses.users

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.*

/**
 * @param count Total friends number
 * @param items 
 */
@Serializable
data class UsersGetFollowersResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<Int>,
)

