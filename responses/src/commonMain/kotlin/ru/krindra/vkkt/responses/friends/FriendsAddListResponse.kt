package ru.krindra.vkkt.responses.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.friends.*

/**
 * @param listId List ID
 */
@Serializable
data class FriendsAddListResponse (
    @SerialName("list_id") val listId: Long,
)

