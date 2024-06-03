package ru.krindra.vknorthtypes.types.messages

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
    @SerialName("id") val id: Long,
    @SerialName("local_id") val localId: Long? = null,
    @SerialName("type") val type: MessagesConversationPeerType,
)
