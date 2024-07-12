package ru.krindra.vkkt.longpoll.user.enums

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

private class PlatformFlagSerializer: EnumAsIntSerializer<PlatformFlag>(
    "DialogFlag", { it.value }, { v -> PlatformFlag.values().first { it.value == v } }
)

@Serializable(with = PlatformFlagSerializer::class)
enum class PlatformFlag(val value: Int) {
    MOBILE(1),
    IPHONE(2),
    IPAD(3),
    ANDROID(4),
    WPHONE(5),
    WINDOWS(6),
    WEB(7);

    companion object { fun fromInt(value: Int) = MessageFlag.entries.first { it.value == value } }
}