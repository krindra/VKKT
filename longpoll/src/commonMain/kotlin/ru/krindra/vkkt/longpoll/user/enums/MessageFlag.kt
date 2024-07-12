package ru.krindra.vkkt.longpoll.user.enums

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

private class MessageFlagSerializer: EnumAsIntSerializer<MessageFlag>(
    "DialogFlag", { it.value }, { v -> MessageFlag.values().first { it.value == v } }
)

@Serializable(with = MessageFlagSerializer::class)
enum class MessageFlag(val value: Int) {
    UNREAD(1),
    OUTBOX(2),
    REPLIED(2.pow(2)),
    IMPORTANT(2.pow(3)),
    CHAT(2.pow(4)),
    FRIENDS(2.pow(5)),
    SPAM(2.pow(6)),
    DELETED(2.pow(7)),
    FIXED(2.pow(8)),
    MEDIA(2.pow(9)),
    HIDDEN(2.pow(16)),
    DELETED_ALL(2.pow(17));

    companion object { fun fromInt(value: Int) = entries.first { it.value == value } }
}