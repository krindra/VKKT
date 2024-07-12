package ru.krindra.vkkt.responses.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.*

/**
 * @param count 
 * @param items 
 */
@Serializable
data class GroupsGetCallbackServersResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<GroupsCallbackServer>,
)

