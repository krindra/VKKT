package ru.krindra.vknorthtypes.types.stories

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.users.UsersUser
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

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

