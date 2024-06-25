package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

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
