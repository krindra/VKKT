package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vknorthtypes.longpoll.user.*

data class ChangeMinorIdUpdate(
    val peerId: Int,
    val minorId: Int,
): UserLPUpdate() {
    companion object {
        val code = 21
        fun fromJsonArray(jsonArray: JsonArray): ChangeMinorIdUpdate {
            return ChangeMinorIdUpdate(
                peerId = jsonArray[0].jsonPrimitive.int,
                minorId = jsonArray[1].jsonPrimitive.int,
            )
        }
    }
}
