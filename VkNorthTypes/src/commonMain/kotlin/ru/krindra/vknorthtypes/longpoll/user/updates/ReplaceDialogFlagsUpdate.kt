package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

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
