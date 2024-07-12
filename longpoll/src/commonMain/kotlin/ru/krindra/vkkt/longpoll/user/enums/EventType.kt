package ru.krindra.vkkt.longpoll.user.enums

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

private class EventTypeSerializer: EnumAsIntSerializer<EventType>(
    "EventType", { it.value }, { v -> EventType.values().first { it.value == v } }
)

@Serializable(with = EventTypeSerializer::class)
enum class EventType(val value: Int) {
    REPLACE_MESSAGE_FLAGS(1),
    SET_MESSAGE_FLAGS(2),
    RESET_MESSAGE_FLAGS(3),
    MESSAGE_NEW(4),
    MESSAGE_EDIT(5),
    READ_INCOMING_MESSAGES(6),
    READ_OUTGOING_MESSAGES(7),
    FRIEND_ONLINE(8),
    FRIEND_OFFLINE(9),
    RESET_DIALOG_FLAGS(10),
    REPLACE_DIALOG_FLAGS(11),
    SET_DIALOG_FLAGS(12),
    DELETE_DIALOG_MESSAGES(13),
    RESTORE_DIALOG_MESSAGES(14),
    CHANGE_MAJOR_ID(20),
    CHANGE_MINOR_ID(21),
    CHAT_SETTINGS_CHANGE(51),
    CHAT_INFO_CHANGED(52),
    USER_TYPING_IN_DIALOG(61),
    USER_TYPING_IN_CHAT(62),
    USERS_TYPING_IN_CHAT(63),
    USER_VOICE_RECORDING(64),
    USER_UPLOAD_PHOTO(65),
    USER_UPLOAD_VIDEO(66),
    USER_UPLOAD_FILE(67),
    USER_CALL(115),
    CHANGE_COUNT_OF_UNREAD_DIALOGS(80),
    CHANGE_INVISIBLE(81),
    FRIEND_STATE_CHANGE(90),
    NOTIFICATION_CHANGE(114),
    MESSAGE_REACTION_NEW(601);

    companion object { fun fromInt(value: Int) = EventType.entries.first { it.value == value } }
}
