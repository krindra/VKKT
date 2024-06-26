package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vknorthtypes.longpoll.user.*

data class MessageEditUpdate(
    val messageId: Int,
    val mask: Int,
    val peerId: Int,
    val timestamp: Int,
    val newText: String,
    val attachments: UserLPAttachments,
): UserLPUpdate() {
    companion object {
        val code = 5
        fun fromJsonArray(jsonArray: JsonArray): MessageEditUpdate {
            return MessageEditUpdate(
                messageId = jsonArray[0].jsonPrimitive.int,
                mask = jsonArray[1].jsonPrimitive.int,
                peerId = jsonArray[2].jsonPrimitive.int,
                timestamp = jsonArray[3].jsonPrimitive.int,
                newText = jsonArray[4].jsonPrimitive.content,
                attachments = jsonArray[5].let { UserLPAttachments.fromJsonObject(it.jsonObject) },
            )
        }
    }
}
