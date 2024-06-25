package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class FriendOnlineUpdate(
    val userId: Int,
    val isTimeout: Int,
    val timestamp: Int,
): UserLPUpdate() {
    companion object {
        val code = 8
        fun fromJsonArray(jsonArray: JsonArray): FriendOnlineUpdate {
            return FriendOnlineUpdate(
                userId = jsonArray[0].jsonPrimitive.int,
                isTimeout = jsonArray[1].jsonPrimitive.int,
                timestamp = jsonArray[2].jsonPrimitive.int,
            )
        }
    }
}
