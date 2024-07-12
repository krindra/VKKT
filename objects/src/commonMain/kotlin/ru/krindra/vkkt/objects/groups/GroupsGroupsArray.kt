package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Communities number
 * @param items 
 */
@Serializable
data class GroupsGroupsArray (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<Int>,
)
