package ru.krindra.vkkt.responses.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.*

/**
 * @param count Total users number
 * @param items 
 */
@Serializable
data class GroupsGetBannedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<GroupsBannedItem>,
)

