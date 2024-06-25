package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class UsersTypingInChatUpdate(
    val userIds: Int,
    val peerId: Int,
    val totalCount: Int,
    val ts: Int,
): UserLPUpdate() {
    companion object {
        val code = 63
        fun fromJsonArray(jsonArray: JsonArray): UsersTypingInChatUpdate {
            return UsersTypingInChatUpdate(
                userIds = jsonArray[0].jsonPrimitive.int,
                peerId = jsonArray[1].jsonPrimitive.int,
                totalCount = jsonArray[2].jsonPrimitive.int,
                ts = jsonArray[3].jsonPrimitive.int,
            )
        }
    }
}
