package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count 
 * @param memberIds 
 */
@Serializable
data class MessagesOutReadBy (
    @SerialName("count") val count: Int? = null,
    @SerialName("member_ids") val memberIds: List<Int>? = null,
)
