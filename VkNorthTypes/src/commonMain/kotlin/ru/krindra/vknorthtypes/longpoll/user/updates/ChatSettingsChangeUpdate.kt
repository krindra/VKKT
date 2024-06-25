package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class ChatSettingsChangeUpdate(
    val chatId: Int,
    val self: Int,
): UserLPUpdate() {
    companion object {
        val code = 51
        fun fromJsonArray(jsonArray: JsonArray): ChatSettingsChangeUpdate {
            return ChatSettingsChangeUpdate(
                chatId = jsonArray[0].jsonPrimitive.int,
                self = jsonArray[1].jsonPrimitive.int,
            )
        }
    }
}
