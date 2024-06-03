package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserFull

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

