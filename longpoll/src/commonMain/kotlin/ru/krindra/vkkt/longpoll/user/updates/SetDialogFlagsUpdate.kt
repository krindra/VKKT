package ru.krindra.vkkt.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vkkt.longpoll.user.*

data class SetDialogFlagsUpdate(
    val peerId: Int,
    val mask: Int,
): UserLPUpdate() {
    companion object {
        val code = 12
        fun fromJsonArray(jsonArray: JsonArray): SetDialogFlagsUpdate {
            return SetDialogFlagsUpdate(
                peerId = jsonArray[0].jsonPrimitive.int,
                mask = jsonArray[1].jsonPrimitive.int,
            )
        }
    }
}
