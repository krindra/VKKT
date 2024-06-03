package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull
import ru.krindra.vknorthtypes.types.users.UsersUserFull

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

