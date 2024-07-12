package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.groups.GroupsGroupFull

/**
 *
 * @param items 
 * @param count Chat members count
 * @param chatRestrictions 
 * @param profiles 
 * @param groups 
 */
@Serializable
data class MessagesGetConversationMembers (
    @SerialName("count") val count: Int,
    @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    @SerialName("items") val items: List<MessagesConversationMember>,
    @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
    @SerialName("chat_restrictions") val chatRestrictions: MessagesChatRestrictions? = null,
)
