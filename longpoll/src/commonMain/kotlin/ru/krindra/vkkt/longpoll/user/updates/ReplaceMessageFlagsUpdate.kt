package ru.krindra.vkkt.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vkkt.longpoll.user.*

data class ReplaceMessageFlagsUpdate(
    val messageId: Int,
    val flags: Int,
    val peerId: Int,
): UserLPUpdate() {
    companion object {
        val code = 1
        fun fromJsonArray(jsonArray: JsonArray): ReplaceMessageFlagsUpdate {
            return ReplaceMessageFlagsUpdate(
                messageId = jsonArray[0].jsonPrimitive.int,
                flags = jsonArray[1].jsonPrimitive.int,
                peerId = jsonArray[2].jsonPrimitive.int,
            )
        }
    }
}
