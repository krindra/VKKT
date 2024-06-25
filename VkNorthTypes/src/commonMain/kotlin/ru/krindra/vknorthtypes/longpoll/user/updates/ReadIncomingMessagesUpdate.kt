package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class ReadIncomingMessagesUpdate(
    val peerId: Int,
    val localId: Int,
): UserLPUpdate() {
    companion object {
        val code = 6
        fun fromJsonArray(jsonArray: JsonArray): ReadIncomingMessagesUpdate {
            return ReadIncomingMessagesUpdate(
                peerId = jsonArray[0].jsonPrimitive.int,
                localId = jsonArray[1].jsonPrimitive.int,
            )
        }
    }
}
