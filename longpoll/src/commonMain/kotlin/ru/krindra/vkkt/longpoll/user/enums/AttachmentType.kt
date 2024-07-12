package ru.krindra.vkkt.longpoll.user.enums

enum class AttachmentType(val value: String) {
    PHOTO("photo"),
    STICKER("sticker"),
    AUDIO("audio"),
    LINK("link"),
    VIDEO("video"),
    DOC("doc"),
    WALL("wall"),
    GIFT("gift"),
    AUDIO_MESSAGE("audio_message"),
    AUDIO_MSG("audiomsg"),
    POLL("poll"),
    GRAFFITI("graffiti"),
    CALL("call");

    companion object {
        fun fromString(string: String): AttachmentType {
            return enumValues<AttachmentType>().first { it.value == string }
        }
    }
}