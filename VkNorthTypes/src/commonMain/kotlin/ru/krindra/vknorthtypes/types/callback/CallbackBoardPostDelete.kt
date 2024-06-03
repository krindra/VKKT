package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param topicOwnerId 
 * @param topicId 
 * @param id 
 */
@Serializable
data class CallbackBoardPostDelete (
    @SerialName("id") val id: Long,
    @SerialName("topic_id") val topicId: Long,
    @SerialName("topic_owner_id") val topicOwnerId: Long,
)
