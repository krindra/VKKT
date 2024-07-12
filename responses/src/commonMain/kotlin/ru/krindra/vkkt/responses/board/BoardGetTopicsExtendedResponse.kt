package ru.krindra.vkkt.responses.board

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.groups.GroupsGroupFull
import ru.krindra.vkkt.objects.users.UsersUserFull
import ru.krindra.vkkt.objects.board.*

/**
 * @param count Total number
 * @param items 
 * @param defaultOrder 
 * @param canAddTopics Information whether current user can add topic
 * @param profiles 
 * @param groups 
 */
@Serializable
data class BoardGetTopicsExtendedResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<BoardTopic>,
    @SerialName("groups") val groups: List<GroupsGroupFull>,
    @SerialName("profiles") val profiles: List<UsersUserFull>,
    @SerialName("can_add_topics") val canAddTopics: BaseBoolInt,
    @SerialName("default_order") val defaultOrder: BoardDefaultOrder,
)

