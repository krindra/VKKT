package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUserFull


/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class AppsGetFriendsListExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<UsersUserFull>,
)

