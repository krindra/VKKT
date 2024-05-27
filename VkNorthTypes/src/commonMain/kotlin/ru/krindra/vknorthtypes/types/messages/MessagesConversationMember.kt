package ru.krindra.vknorthtypes.types.messages

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
    @SerialName("is_admin") val isAdmin: Boolean? = null,
    @SerialName("join_date") val joinDate: Int? = null,
    @SerialName("request_date") val requestDate: Int? = null,
    @SerialName("invited_by") val invitedBy: Int? = null,
    @SerialName("member_id") val memberId: Long,
    @SerialName("can_kick") val canKick: Boolean? = null,
    @SerialName("is_message_request") val isMessageRequest: Boolean? = null,
    @SerialName("is_owner") val isOwner: Boolean? = null,
)
