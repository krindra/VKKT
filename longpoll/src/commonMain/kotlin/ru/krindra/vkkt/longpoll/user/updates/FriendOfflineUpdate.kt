package ru.krindra.vkkt.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vkkt.longpoll.user.*

data class FriendOfflineUpdate(
    val userId: Int,
    val flags: Int,
    val timestamp: Int,
): UserLPUpdate() {
    companion object {
        val code = 9
        fun fromJsonArray(jsonArray: JsonArray): FriendOfflineUpdate {
            return FriendOfflineUpdate(
                userId = jsonArray[0].jsonPrimitive.int,
                flags = jsonArray[1].jsonPrimitive.int,
                timestamp = jsonArray[2].jsonPrimitive.int,
            )
        }
    }
}
