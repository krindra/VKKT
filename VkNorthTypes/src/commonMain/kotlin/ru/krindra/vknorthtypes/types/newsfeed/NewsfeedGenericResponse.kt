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
    @SerialName("items") val items: List<NewsfeedNewsfeedItem>,
    @SerialName("profiles") val profiles: List<UsersUserFull>,
    @SerialName("groups") val groups: List<GroupsGroupFull>,
    @SerialName("lives_items") val livesItems: List<NewsfeedNewsfeedItem>? = null,
)

