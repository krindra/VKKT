package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total count of addresses
 * @param items 
 */
@Serializable
data class GroupsGetAddressesResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<GroupsAddress>,
)

