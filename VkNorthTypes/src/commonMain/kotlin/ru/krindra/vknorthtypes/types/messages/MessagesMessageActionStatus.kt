package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Action status
 * 
 */
@Serializable
enum class MessagesMessageActionStatus(val value: String){
    @SerialName("chat_photo_update") CHAT_PHOTO_UPDATE("chat_photo_update"),
    @SerialName("chat_photo_remove") CHAT_PHOTO_REMOVE("chat_photo_remove"),
    @SerialName("chat_create") CHAT_CREATE("chat_create"),
    @SerialName("chat_title_update") CHAT_TITLE_UPDATE("chat_title_update"),
    @SerialName("chat_invite_user") CHAT_INVITE_USER("chat_invite_user"),
    @SerialName("chat_kick_user") CHAT_KICK_USER("chat_kick_user"),
    @SerialName("chat_pin_message") CHAT_PIN_MESSAGE("chat_pin_message"),
    @SerialName("chat_unpin_message") CHAT_UNPIN_MESSAGE("chat_unpin_message"),
    @SerialName("chat_invite_user_by_link") CHAT_INVITE_USER_BY_LINK("chat_invite_user_by_link"),
    @SerialName("chat_invite_user_by_message_request") CHAT_INVITE_USER_BY_MESSAGE_REQUEST("chat_invite_user_by_message_request"),
    @SerialName("chat_screenshot") CHAT_SCREENSHOT("chat_screenshot"),
}
