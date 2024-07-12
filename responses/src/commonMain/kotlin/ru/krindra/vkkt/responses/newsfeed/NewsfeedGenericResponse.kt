package ru.krindra.vkkt.responses.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.newsfeed.*

/**
 * @param items 
 * @param profiles 
 * @param groups 
 * @param livesItems 
 */
@Serializable
data class NewsfeedGenericResponse (
    @SerialName("groups") val groups: List<GroupsGroupFull>,
    @SerialName("profiles") val profiles: List<UsersUserFull>,
    @SerialName("items") val items: List<NewsfeedNewsfeedItem>,
    @SerialName("lives_items") val livesItems: List<NewsfeedNewsfeedItem>? = null,
)

