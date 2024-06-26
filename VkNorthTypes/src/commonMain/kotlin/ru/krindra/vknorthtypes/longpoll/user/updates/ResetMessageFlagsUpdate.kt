package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vknorthtypes.longpoll.user.*

data class ResetMessageFlagsUpdate(
    val messageId: Int,
    val mask: Int,
    val peerId: Int,
): UserLPUpdate() {
    companion object {
        val code = 3
        fun fromJsonArray(jsonArray: JsonArray): ResetMessageFlagsUpdate {
            return ResetMessageFlagsUpdate(
                messageId = jsonArray[0].jsonPrimitive.int,
                mask = jsonArray[1].jsonPrimitive.int,
                peerId = jsonArray[2].jsonPrimitive.int,
            )
        }
    }
}
