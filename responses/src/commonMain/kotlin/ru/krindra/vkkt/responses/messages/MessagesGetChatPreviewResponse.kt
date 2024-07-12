package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.messages.*

/**
 * @param preview 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class MessagesGetChatPreviewResponse (
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("preview") val preview: MessagesChatPreview? = null,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
)

