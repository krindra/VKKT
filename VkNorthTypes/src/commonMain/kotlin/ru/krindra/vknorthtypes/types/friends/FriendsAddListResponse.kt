package ru.krindra.vknorthtypes.types.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param listId List ID
 */
@Serializable
data class FriendsAddListResponse (
    @SerialName("list_id") val listId: Long,
)

