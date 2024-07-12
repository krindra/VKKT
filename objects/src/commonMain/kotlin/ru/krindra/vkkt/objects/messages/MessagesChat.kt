package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param adminId Chat creator ID
 * @param id Chat ID
 * @param kicked Shows that user has been kicked from the chat
 * @param left Shows that user has been left the chat
 * @param photo100 URL of the preview image with 100 px in width
 * @param photo200 URL of the preview image with 200 px in width
 * @param photo50 URL of the preview image with 50 px in width
 * @param pushSettings 
 * @param title Chat title
 * @param type Chat type
 * @param users 
 * @param isDefaultPhoto If provided photo is default
 * @param membersCount Count members in a chat
 * @param isGroupChannel If chat is group channel
 */
@Serializable
data class MessagesChat (
    @SerialName("id") val id: Long,
    @SerialName("type") val type: String,
    @SerialName("admin_id") val adminId: Long,
    @SerialName("users") val users: List<Int>,
    @SerialName("title") val title: String? = null,
    @SerialName("left") val left: BaseBoolInt? = null,
    @SerialName("members_count") val membersCount: Int,
    @SerialName("photo_50") val photo50: String? = null,
    @SerialName("kicked") val kicked: BaseBoolInt? = null,
    @SerialName("photo_100") val photo100: String? = null,
    @SerialName("photo_200") val photo200: String? = null,
    @SerialName("is_default_photo") val isDefaultPhoto: Boolean? = null,
    @SerialName("is_group_channel") val isGroupChannel: Boolean? = null,
    @SerialName("push_settings") val pushSettings: MessagesChatPushSettings? = null,
)
