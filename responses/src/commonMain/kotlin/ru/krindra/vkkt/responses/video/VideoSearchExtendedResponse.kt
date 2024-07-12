package ru.krindra.vkkt.responses.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUser
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.video.*

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

