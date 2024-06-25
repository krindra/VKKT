package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class ResetMessageFlagsUpdate(
    val messageId: Int,
    val mask: Int,
    // extra fields
    val text: String? = null,
    //val info: MessageInfo? = null
    val attachments: UserLPAttachments? = null,
    val randomId:Int? = null,
): UserLPUpdate() {
    companion object {
        val code = 3
        fun fromJsonArray(jsonArray: JsonArray): ResetMessageFlagsUpdate {
            return ResetMessageFlagsUpdate(
                messageId = jsonArray[0].jsonPrimitive.int,
                mask = jsonArray[1].jsonPrimitive.int,
                
                text = jsonArray.getOrNull(2)?.jsonPrimitive?.content,
                //attachments = jsonArray.getOrNull(3)?.TODO(),
                //info = jsonArray.getOrNull(4)?.TODO(),
                randomId = jsonArray.getOrNull(5)?.jsonPrimitive?.int,
            )
        }
    }
}
