package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param canKick Is it possible for user to kick this member
 * @param invitedBy 
 * @param isAdmin 
 * @param isOwner 
 * @param isMessageRequest 
 * @param joinDate 
 * @param requestDate Message request date
 * @param memberId 
 */
@Serializable
data class MessagesConversationMember (
    @SerialName("member_id") val memberId: Long,
    @SerialName("join_date") val joinDate: Int? = null,
    @SerialName("can_kick") val canKick: Boolean? = null,
    @SerialName("invited_by") val invitedBy: Int? = null,
    @SerialName("is_admin") val isAdmin: Boolean? = null,
    @SerialName("is_owner") val isOwner: Boolean? = null,
    @SerialName("request_date") val requestDate: Int? = null,
    @SerialName("is_message_request") val isMessageRequest: Boolean? = null,
)
