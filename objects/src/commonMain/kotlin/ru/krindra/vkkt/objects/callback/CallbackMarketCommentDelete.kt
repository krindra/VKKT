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
    @SerialName("id") val id: Int,
    @SerialName("item_id") val itemId: Int,
    @SerialName("user_id") val userId: Int,
    @SerialName("owner_id") val ownerId: Int,
)
