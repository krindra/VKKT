package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class UserTypingInChatUpdate(
    val userId: Int,
    val chatId: Int,
): UserLPUpdate() {
    companion object {
        val code = 62
        fun fromJsonArray(jsonArray: JsonArray): UserTypingInChatUpdate {
            return UserTypingInChatUpdate(
                userId = jsonArray[0].jsonPrimitive.int,
                chatId = jsonArray[1].jsonPrimitive.int,
            )
        }
    }
}
