package ru.krindra.vkkt.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vkkt.longpoll.user.*

data class ReadOutgoingMessagesUpdate(
    val peerId: Int,
    val messageId: Int,
    val count: Int,
): UserLPUpdate() {
    companion object {
        val code = 7
        fun fromJsonArray(jsonArray: JsonArray): ReadOutgoingMessagesUpdate {
            return ReadOutgoingMessagesUpdate(
                peerId = jsonArray[0].jsonPrimitive.int,
                messageId = jsonArray[1].jsonPrimitive.int,
                count = jsonArray[2].jsonPrimitive.int,
            )
        }
    }
}
