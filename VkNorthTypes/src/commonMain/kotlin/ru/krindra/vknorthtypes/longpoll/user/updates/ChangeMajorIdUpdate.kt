package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vknorthtypes.longpoll.user.*

data class ChangeMajorIdUpdate(
    val peerId: Int,
    val majorId: Int,
): UserLPUpdate() {
    companion object {
        val code = 20
        fun fromJsonArray(jsonArray: JsonArray): ChangeMajorIdUpdate {
            return ChangeMajorIdUpdate(
                peerId = jsonArray[0].jsonPrimitive.int,
                majorId = jsonArray[1].jsonPrimitive.int,
            )
        }
    }
}
