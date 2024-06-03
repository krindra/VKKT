package ru.krindra.vknorthtypes.types.board

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.polls.PollsPoll

/**
 * @param count Total number
 * @param items 
 * @param poll 
 * @param realOffset Offset of comment
 */
@Serializable
data class BoardGetCommentsResponse (
    @SerialName("count") val count: Int,
    @SerialName("poll") val poll: PollsPoll? = null,
    @SerialName("real_offset") val realOffset: Int? = null,
    @SerialName("items") val items: List<BoardTopicComment>,
)

