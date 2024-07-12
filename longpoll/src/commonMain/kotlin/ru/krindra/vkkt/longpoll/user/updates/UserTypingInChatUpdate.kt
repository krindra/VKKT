package ru.krindra.vkkt.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vkkt.longpoll.user.*

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
