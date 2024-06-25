package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class ChatInfoChangedUpdate(
    val typeId: Int,
    val peerId: Int,
    val info: String,
): UserLPUpdate() {
    companion object {
        val code = 52
        fun fromJsonArray(jsonArray: JsonArray): ChatInfoChangedUpdate {
            return ChatInfoChangedUpdate(
                typeId = jsonArray[0].jsonPrimitive.int,
                peerId = jsonArray[1].jsonPrimitive.int,
                info = jsonArray[2].jsonPrimitive.content,
            )
        }
    }
}
