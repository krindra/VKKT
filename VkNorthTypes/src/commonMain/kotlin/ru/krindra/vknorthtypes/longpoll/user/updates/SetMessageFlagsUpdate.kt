package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class SetMessageFlagsUpdate(
    val messageId: Int,
    val mask: Int,
    // extra fields
    val text: String? = null,
    //val info: MessageInfo? = null
    val attachments: UserLPAttachments? = null,
    val randomId:Int? = null,
): UserLPUpdate() {
    companion object {
        val code = 2
        fun fromJsonArray(jsonArray: JsonArray): SetMessageFlagsUpdate {
            return SetMessageFlagsUpdate(
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
