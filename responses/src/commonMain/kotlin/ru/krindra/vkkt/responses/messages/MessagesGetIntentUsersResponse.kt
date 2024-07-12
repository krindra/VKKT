package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.messages.*

/**
 * @param count 
 * @param items 
 * @param profiles 
 */
@Serializable
data class MessagesGetIntentUsersResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<Int>,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)

