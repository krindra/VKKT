package ru.krindra.vknorthtypes.types.board

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt


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
    @SerialName("default_order") val defaultOrder: BoardDefaultOrder,
    @SerialName("can_add_topics") val canAddTopics: BaseBoolInt,
)

