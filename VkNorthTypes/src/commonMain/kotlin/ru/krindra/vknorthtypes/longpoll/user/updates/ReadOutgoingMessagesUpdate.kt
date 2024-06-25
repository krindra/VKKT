package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

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
