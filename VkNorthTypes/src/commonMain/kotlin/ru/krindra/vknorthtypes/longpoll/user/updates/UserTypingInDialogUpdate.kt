package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class UserTypingInDialogUpdate(
    val userId: Int,
    val flags: Int,
): UserLPUpdate() {
    companion object {
        val code = 61
        fun fromJsonArray(jsonArray: JsonArray): UserTypingInDialogUpdate {
            return UserTypingInDialogUpdate(
                userId = jsonArray[0].jsonPrimitive.int,
                flags = jsonArray[1].jsonPrimitive.int,
            )
        }
    }
}
