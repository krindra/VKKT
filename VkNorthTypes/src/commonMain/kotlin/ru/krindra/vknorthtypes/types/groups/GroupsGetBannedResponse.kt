package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total users number
 * @param items 
 */
@Serializable
data class GroupsGetBannedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<GroupsBannedItem>,
)

