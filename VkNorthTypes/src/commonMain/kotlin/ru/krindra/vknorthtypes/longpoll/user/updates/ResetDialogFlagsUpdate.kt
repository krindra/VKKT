package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vknorthtypes.longpoll.user.*

data class ResetDialogFlagsUpdate(
    val peerId: Int,
    val mask: Int,
): UserLPUpdate() {
    companion object {
        val code = 10
        fun fromJsonArray(jsonArray: JsonArray): ResetDialogFlagsUpdate {
            return ResetDialogFlagsUpdate(
                peerId = jsonArray[0].jsonPrimitive.int,
                mask = jsonArray[1].jsonPrimitive.int,
            )
        }
    }
}
