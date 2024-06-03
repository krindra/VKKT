package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull
import ru.krindra.vknorthtypes.types.users.UsersUserFull

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

