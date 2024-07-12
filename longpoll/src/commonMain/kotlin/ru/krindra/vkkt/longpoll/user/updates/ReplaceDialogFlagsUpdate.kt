package ru.krindra.vkkt.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vkkt.longpoll.user.*

data class ReplaceDialogFlagsUpdate(
    val peerId: Int,
    val flags: Int,
): UserLPUpdate() {
    companion object {
        val code = 11
        fun fromJsonArray(jsonArray: JsonArray): ReplaceDialogFlagsUpdate {
            return ReplaceDialogFlagsUpdate(
                peerId = jsonArray[0].jsonPrimitive.int,
                flags = jsonArray[1].jsonPrimitive.int,
            )
        }
    }
}
