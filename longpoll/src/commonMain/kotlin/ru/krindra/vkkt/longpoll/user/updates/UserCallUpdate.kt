package ru.krindra.vkkt.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vkkt.longpoll.user.*

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
