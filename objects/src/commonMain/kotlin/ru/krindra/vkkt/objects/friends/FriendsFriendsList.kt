package ru.krindra.vkkt.objects.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id List ID
 * @param name List title
 */
@Serializable
data class FriendsFriendsList (
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
)
