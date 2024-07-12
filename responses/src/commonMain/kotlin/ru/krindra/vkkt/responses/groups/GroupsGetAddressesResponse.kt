package ru.krindra.vkkt.responses.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.*

/**
 * @param count Total count of addresses
 * @param items 
 */
@Serializable
data class GroupsGetAddressesResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<GroupsAddress>,
)

