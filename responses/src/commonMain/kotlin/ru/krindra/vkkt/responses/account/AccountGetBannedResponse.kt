package ru.krindra.vkkt.responses.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroup
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.account.*

/**
 * @param count Total number
 * @param items 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class AccountGetBannedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<Int>,
    @SerialName("groups") val groups: List<GroupsGroup>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)

