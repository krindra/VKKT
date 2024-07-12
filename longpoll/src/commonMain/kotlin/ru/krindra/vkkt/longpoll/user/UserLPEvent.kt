package ru.krindra.vkkt.longpoll.user

import kotlinx.serialization.json.int
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import ru.krindra.vkkt.longpoll.user.updates.UserLPUpdate
import ru.krindra.vkkt.utils.JsonSingleton

data class UserLPEvent(
    val ts: Int,
    val updates: List<UserLPUpdate>,
) {
    companion object {
        fun fromEvent(rawEvent: String): UserLPEvent {
            val jsonEvent = JsonSingleton.json
                .parseToJsonElement(rawEvent)

            val ts = jsonEvent
                .jsonObject["ts"]!!
                .jsonPrimitive.int

            val rawUpdates = jsonEvent
                .jsonObject["updates"]!!
                .jsonArray
            val updates = mutableListOf<UserLPUpdate>()
            for (rawUpdate in rawUpdates)
                updates.add(UserLPUpdate.fromJsonArray(rawUpdate.jsonArray))

            return UserLPEvent(ts, updates)
        }
    }
}