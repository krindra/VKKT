package ru.krindra.vkkt.responses.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.apps.*

/**
 * @param count Total number of applications
 * @param items List of applications
 * @param profiles List of friends profiles, used only when return_friends=true
 * @param groups List of groups, used only when extended=true
 */
@Serializable
data class AppsGetResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<AppsApp>,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)

