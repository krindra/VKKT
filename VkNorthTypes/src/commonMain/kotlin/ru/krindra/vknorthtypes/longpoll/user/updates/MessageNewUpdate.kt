package ru.krindra.vknorthtypes.longpoll.user.updates

import ru.krindra.vknorthtypes.JsonSingleton
import kotlinx.serialization.json.*
import ru.krindra.vknorthtypes.longpoll.user.*

data class MessageNewUpdate(
    val messageId: Int,
    val flags: Int,
    val peerId: Int,
    val timestamp: Int,
    // extra fields
    val text: String = "",
    val info: MessageInfo? = null,
    val attachments: UserLPAttachments? = null,
    val randomId:Int? = null,
): UserLPUpdate() {
    companion object {
        val code = 4
        fun fromJsonArray(jsonArray: JsonArray): MessageNewUpdate {
            return MessageNewUpdate(
                messageId = jsonArray[0].jsonPrimitive.int,
                flags = jsonArray[1].jsonPrimitive.int,
                peerId = jsonArray[2].jsonPrimitive.int,
                timestamp = jsonArray[3].jsonPrimitive.int,
                
                text = jsonArray.getOrNull(4)?.jsonPrimitive?.content ?: "",
                info = jsonArray.getOrNull(5)
                    ?.let { JsonSingleton.json.decodeFromJsonElement(it) },
                attachments = jsonArray.getOrNull(6)
                    .let { UserLPAttachments.fromJsonObject(it?.jsonObject) }, 
                randomId = jsonArray.getOrNull(7)?.jsonPrimitive?.int,
            )
        }
    }
}
