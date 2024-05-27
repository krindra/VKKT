package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param link 
 */
@Serializable
data class MessagesGetInviteLinkResponse (
    @SerialName("link") val link: String? = null,
)

