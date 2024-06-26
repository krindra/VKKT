package ru.krindra.vknorthtypes.longpoll.user

import kotlinx.serialization.json.int
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import ru.krindra.vknorthtypes.JsonSingleton
import ru.krindra.vknorthtypes.longpoll.user.updates.UserLPUpdate

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