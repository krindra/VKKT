package ru.krindra.vkkt.responses.board

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.board.*

/**
 * @param count Total number
 * @param items 
 * @param defaultOrder 
 * @param canAddTopics Information whether current user can add topic
 */
@Serializable
data class BoardGetTopicsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<BoardTopic>,
    @SerialName("can_add_topics") val canAddTopics: BaseBoolInt,
    @SerialName("default_order") val defaultOrder: BoardDefaultOrder,
)

