package ru.krindra.vkkt.longpoll.user.enums

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

private class DialogFlagSerializer: EnumAsIntSerializer<DialogFlag>(
    "DialogFlag", { it.value }, { v -> DialogFlag.entries.first { it.value == v } }
)

@Serializable(with = DialogFlagSerializer::class)
enum class DialogFlag(val value: Int) {
    IMPORTANT(1),
    UNANSWERED(2);

    companion object { fun fromInt(value: Int) = MessageFlag.entries.first { it.value == value } }
}