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
 * @param nextFrom Next from value
 */
@Serializable
data class NewsfeedGetCommentsResponse (
    @SerialName("next_from") val nextFrom: String? = null,
    @SerialName("groups") val groups: List<GroupsGroupFull>,
    @SerialName("profiles") val profiles: List<UsersUserFull>,
    @SerialName("items") val items: List<NewsfeedCommentsItem>,
)

