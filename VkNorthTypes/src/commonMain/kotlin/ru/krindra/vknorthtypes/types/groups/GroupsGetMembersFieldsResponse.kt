package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total members number
 * @param items 
 * @param nextFrom Encoded string for a next page
 */
@Serializable
data class GroupsGetMembersFieldsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<GroupsUserXtrRole>,
    @SerialName("next_from") val nextFrom: String? = null,
)

