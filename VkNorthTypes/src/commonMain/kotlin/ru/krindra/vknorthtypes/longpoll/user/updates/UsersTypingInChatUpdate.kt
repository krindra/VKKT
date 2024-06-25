package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class UsersTypingInChatUpdate(
    val peerId: Int,
    val userIds: List<Int>,
    val totalCount: Int,
    val ts: Int,
): UserLPUpdate() {
    companion object {
        val code = 63
        fun fromJsonArray(jsonArray: JsonArray): UsersTypingInChatUpdate {
            return UsersTypingInChatUpdate(
                peerId = jsonArray[0].jsonPrimitive.int,
                userIds = jsonArray[1].jsonArray.map { it.jsonPrimitive.int },
                totalCount = jsonArray[2].jsonPrimitive.int,
                ts = jsonArray[3].jsonPrimitive.int,
            )
        }
    }
}
