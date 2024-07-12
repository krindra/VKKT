package ru.krindra.vkkt.responses.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.stories.*

/**
 * @param count Stories count
 * @param items 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class StoriesGetBannedExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<Int>,
    @SerialName("groups") val groups: List<GroupsGroupFull>,
    @SerialName("profiles") val profiles: List<UsersUserFull>,
)

