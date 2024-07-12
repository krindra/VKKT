package ru.krindra.vkkt.responses.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.*

/**
 * @param count Total members number
 * @param items 
 * @param nextFrom Encoded string for a next page
 */
@Serializable
data class GroupsGetMembersFieldsResponse (
    @SerialName("count") val count: Int,
    @SerialName("next_from") val nextFrom: String? = null,
    @SerialName("items") val items: List<GroupsUserXtrRole>,
)

