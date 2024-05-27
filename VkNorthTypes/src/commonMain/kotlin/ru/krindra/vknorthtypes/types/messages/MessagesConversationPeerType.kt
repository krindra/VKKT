package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Peer type
 * 
 */
@Serializable
enum class MessagesConversationPeerType(val value: String){
    @SerialName("chat") CHAT("chat"),
    @SerialName("email") EMAIL("email"),
    @SerialName("user") USER("user"),
    @SerialName("group") GROUP("group"),
}
