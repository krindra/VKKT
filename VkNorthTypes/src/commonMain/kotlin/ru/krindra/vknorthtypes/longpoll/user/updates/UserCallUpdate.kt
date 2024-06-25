package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class UserCallUpdate(
    val userId: Int,
    val callId: Int,
): UserLPUpdate() {
    companion object {
        val code = 70
        fun fromJsonArray(jsonArray: JsonArray): UserCallUpdate {
            return UserCallUpdate(
                userId = jsonArray[0].jsonPrimitive.int,
                callId = jsonArray[1].jsonPrimitive.int,
            )
        }
    }
}
