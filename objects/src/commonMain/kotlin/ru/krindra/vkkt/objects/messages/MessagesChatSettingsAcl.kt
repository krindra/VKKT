package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param canChangeInfo Can you change photo, description and name
 * @param canChangeInviteLink Can you change invite link for this chat
 * @param canChangePin Can you pin/unpin message for this chat
 * @param canInvite Can you invite other peers in chat
 * @param canPromoteUsers Can you promote simple users to chat admins
 * @param canSeeInviteLink Can you see invite link for this chat
 * @param canModerate Can you moderate (delete) other users' messages
 * @param canCopyChat Can you copy chat
 * @param canCall Can you init group call in the chat
 * @param canUseMassMentions Can you use mass mentions
 * @param canChangeServiceType Can you change chat service type
 */
@Serializable
data class MessagesChatSettingsAcl (
    @SerialName("can_call") val canCall: Boolean,
    @SerialName("can_invite") val canInvite: Boolean,
    @SerialName("can_moderate") val canModerate: Boolean,
    @SerialName("can_copy_chat") val canCopyChat: Boolean,
    @SerialName("can_change_pin") val canChangePin: Boolean,
    @SerialName("can_change_info") val canChangeInfo: Boolean,
    @SerialName("can_promote_users") val canPromoteUsers: Boolean,
    @SerialName("can_see_invite_link") val canSeeInviteLink: Boolean,
    @SerialName("can_use_mass_mentions") val canUseMassMentions: Boolean,
    @SerialName("can_change_invite_link") val canChangeInviteLink: Boolean,
    @SerialName("can_change_service_type") val canChangeServiceType: Boolean? = null,
)
