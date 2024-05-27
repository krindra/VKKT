package ru.krindra.vknorthtypes.types.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

import ru.krindra.vknorthtypes.types.users.UsersUser


/**
 * @param count Total number
 * @param items 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class VideoSearchExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<VideoVideoFull>,
    @SerialName("profiles") val profiles: List<UsersUser>,
    @SerialName("groups") val groups: List<GroupsGroupFull>,
)

