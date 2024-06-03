package ru.krindra.vknorthtypes.types.fave

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull
import ru.krindra.vknorthtypes.types.users.UsersUserFull

/**
 *
 * @param description Some info about user or group
 * @param group 
 * @param tags 
 * @param type Item type
 * @param updatedDate Timestamp, when this page was bookmarked
 * @param user 
 */
@Serializable
data class FavePage (
    @SerialName("type") val type: FavePageType,
    @SerialName("tags") val tags: List<FaveTag>,
    @SerialName("description") val description: String,
    @SerialName("user") val user: UsersUserFull? = null,
    @SerialName("group") val group: GroupsGroupFull? = null,
    @SerialName("updated_date") val updatedDate: Int? = null,
)
