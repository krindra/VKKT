package ru.krindra.vkkt.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vkkt.longpoll.user.*

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
