package ru.krindra.vkkt.longpoll.user.updates

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.*
import ru.krindra.vkkt.utils.JsonSingleton
import ru.krindra.vkkt.longpoll.user.enums.AttachmentType


data class Attachments(
    val fwd: String? = null,
    val reply: Reply? = null,
    val attachments: List<Attachment> = emptyList()
) {
    data class Attachment(
        val type: AttachmentType,
        val attach: String,
    ) {
        constructor(type: String, attach: String)
                : this(AttachmentType.fromString(type), attach)
    }

    @Serializable
    data class Reply(
        @SerialName("conversation_message_id") val conversationMessageId: Int? = null,
    )

    companion object {
        fun fromJsonObject(rawAttachment: JsonObject?): Attachments {
            if (rawAttachment == null)
                return Attachments()
            val fwd = rawAttachment["fwd"]
                ?.jsonPrimitive?.contentOrNull
            val rawReply = rawAttachment["reply"]
            val reply: Reply? = rawReply?.let {
                val str = if (rawReply.jsonPrimitive.isString)
                    // I don't know why, but sometimes vk sends string instead of json object
                    rawReply.jsonPrimitive.content.substring(0..<rawReply.jsonPrimitive.content.length)
                else rawReply.toString()
                JsonSingleton.json.decodeFromString(str)
            }
            val attachments = mutableListOf<Attachment>()
            for (i in 1..10) {
                val key = "attach$i"
                val rawType = rawAttachment[key + "_type"]?.jsonPrimitive?.content
                if (rawType != null) {
                    val attach: String = rawAttachment[key]!!.jsonPrimitive.content
                    attachments.add(Attachment(rawType, attach))
                }
            }
            return Attachments(fwd, reply, attachments)
        }
    }
}
