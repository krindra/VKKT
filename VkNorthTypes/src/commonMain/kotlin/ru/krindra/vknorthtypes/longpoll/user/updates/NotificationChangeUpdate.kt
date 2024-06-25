package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class NotificationChangeUpdate(
    val peerId: Int,
    val sound: Int,
    val disabledUntil: Int,
): UserLPUpdate() {
    companion object {
        val code = 114
        fun fromJsonArray(jsonArray: JsonArray): NotificationChangeUpdate {
            return NotificationChangeUpdate(
                peerId = jsonArray[0].jsonPrimitive.int,
                sound = jsonArray[1].jsonPrimitive.int,
                disabledUntil = jsonArray[2].jsonPrimitive.int,
            )
        }
    }
}
