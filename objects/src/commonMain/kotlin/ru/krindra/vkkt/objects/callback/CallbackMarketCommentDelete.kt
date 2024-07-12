package ru.krindra.vkkt.objects.callback

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
    @SerialName("id") val id: Long,
    @SerialName("item_id") val itemId: Long,
    @SerialName("user_id") val userId: Long,
    @SerialName("owner_id") val ownerId: Long,
)
