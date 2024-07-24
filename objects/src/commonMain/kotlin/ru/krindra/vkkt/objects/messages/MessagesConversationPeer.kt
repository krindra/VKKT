package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param localId 
 * @param type 
 */
@Serializable
data class MessagesConversationPeer (
    @SerialName("id") val id: Int,
    @SerialName("local_id") val localId: Int? = null,
    @SerialName("type") val type: MessagesConversationPeerType,
)
