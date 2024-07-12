package ru.krindra.vkkt.responses.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.messages.*

/**
 * @param link 
 */
@Serializable
data class MessagesGetInviteLinkResponse (
    @SerialName("link") val link: String? = null,
)

