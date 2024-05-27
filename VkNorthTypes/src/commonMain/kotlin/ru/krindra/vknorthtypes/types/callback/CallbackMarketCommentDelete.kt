package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param ownerId 
 * @param id 
 * @param userId 
 * @param itemId 
 */
@Serializable
data class CallbackMarketCommentDelete (
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("user_id") val userId: Long,
    @SerialName("item_id") val itemId: Long,
    @SerialName("id") val id: Long,
)
