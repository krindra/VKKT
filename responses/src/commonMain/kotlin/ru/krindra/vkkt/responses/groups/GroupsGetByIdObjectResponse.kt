package ru.krindra.vkkt.responses.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.*

/**
 * @param groups 
 * @param profiles 
 */
@Serializable
data class GroupsGetByIdObjectResponse (
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<GroupsProfileItem>? = null,
)

