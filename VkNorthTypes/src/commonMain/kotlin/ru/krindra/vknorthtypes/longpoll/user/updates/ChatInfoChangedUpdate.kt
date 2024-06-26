package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vknorthtypes.longpoll.user.*

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
