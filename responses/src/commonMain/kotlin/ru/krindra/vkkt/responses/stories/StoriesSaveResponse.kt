package ru.krindra.vkkt.responses.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUser
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.stories.*

/**
 * @param count 
 * @param items 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class StoriesSaveResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<StoriesStory>,
    @SerialName("profiles") val profiles: List<UsersUser>? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
)

