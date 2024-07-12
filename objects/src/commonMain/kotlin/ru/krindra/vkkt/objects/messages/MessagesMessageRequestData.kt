package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param status Status of message request
 * @param inviterId Message request sender id
 * @param requestDate Message request date
 */
@Serializable
data class MessagesMessageRequestData (
    @SerialName("status") val status: String? = null,
    @SerialName("inviter_id") val inviterId: Long? = null,
    @SerialName("request_date") val requestDate: Int? = null,
)
