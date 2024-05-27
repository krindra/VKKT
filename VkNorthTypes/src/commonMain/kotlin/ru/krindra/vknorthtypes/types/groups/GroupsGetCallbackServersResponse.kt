package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count 
 * @param items 
 */
@Serializable
data class GroupsGetCallbackServersResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<GroupsCallbackServer>,
)

