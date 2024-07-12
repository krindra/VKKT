package ru.krindra.vkkt.responses.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.apps.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class AppsGetFriendsListExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<UsersUserFull>,
)

