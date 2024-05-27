package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count Communities number
 * @param items 
 */
@Serializable
data class GroupsGroupsArray (
    @SerialName("items") val items: List<Int>,
    @SerialName("count") val count: Int,
)
