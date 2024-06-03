package ru.krindra.vknorthtypes.types.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserFull

/**
 * @param count Total friends number
 * @param items 
 * @param profiles 
 */
@Serializable
data class FriendsGetFieldsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<UsersUserFull>,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)

