package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param membersCount 
 * @param friendsCount 
 * @param ownerId 
 * @param title Chat title
 * @param pinnedMessage 
 * @param state 
 * @param photo 
 * @param adminIds Ids of chat admins
 * @param activeIds 
 * @param isGroupChannel 
 * @param acl 
 * @param permissions 
 * @param isDisappearing 
 * @param theme 
 * @param disappearingChatLink 
 * @param isService 
 */
@Serializable
data class MessagesChatSettings (
    @SerialName("title") val title: String,
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("theme") val theme: String? = null,
    @SerialName("acl") val acl: MessagesChatSettingsAcl,
    @SerialName("admin_ids") val adminIds: List<Int>? = null,
    @SerialName("is_service") val isService: Boolean? = null,
    @SerialName("state") val state: MessagesChatSettingsState,
    @SerialName("active_ids") val activeIds: List<Int>? = null,
    @SerialName("friends_count") val friendsCount: Int? = null,
    @SerialName("members_count") val membersCount: Int? = null,
    @SerialName("photo") val photo: MessagesChatSettingsPhoto? = null,
    @SerialName("is_disappearing") val isDisappearing: Boolean? = null,
    @SerialName("is_group_channel") val isGroupChannel: Boolean? = null,
    @SerialName("disappearing_chat_link") val disappearingChatLink: String? = null,
    @SerialName("pinned_message") val pinnedMessage: MessagesPinnedMessage? = null,
    @SerialName("permissions") val permissions: MessagesChatSettingsPermissions? = null,
)
