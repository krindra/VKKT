package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total communities number
 * @param items 
 */
@Serializable
data class GroupsGetInvitesResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<GroupsGroupFull>,
)

