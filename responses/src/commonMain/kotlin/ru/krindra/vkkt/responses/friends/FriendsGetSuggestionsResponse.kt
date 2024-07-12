package ru.krindra.vkkt.responses.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.friends.*

/**
 * @param count Total results number
 * @param items 
 */
@Serializable
data class FriendsGetSuggestionsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<UsersUserFull>,
)

