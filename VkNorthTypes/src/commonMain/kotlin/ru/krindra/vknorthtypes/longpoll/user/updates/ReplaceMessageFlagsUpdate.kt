package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class ReplaceMessageFlagsUpdate(
    val messageId: Int,
    val flags: Int,
    // extra fields
    val text: String? = null,
    //val info: MessageInfo? = null
    val attachments: UserLPAttachments? = null,
    val randomId:Int? = null,
): UserLPUpdate() {
    companion object {
        val code = 1
        fun fromJsonArray(jsonArray: JsonArray): ReplaceMessageFlagsUpdate {
            return ReplaceMessageFlagsUpdate(
                messageId = jsonArray[0].jsonPrimitive.int,
                flags = jsonArray[1].jsonPrimitive.int,
                
                text = jsonArray.getOrNull(2)?.jsonPrimitive?.content,
                //attachments = jsonArray.getOrNull(3)?.TODO(),
                //info = jsonArray.getOrNull(4)?.TODO(),
                randomId = jsonArray.getOrNull(5)?.jsonPrimitive?.int,
            )
        }
    }
}
