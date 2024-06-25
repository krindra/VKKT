package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class RestoreDialogMessagesUpdate(
    val peerId: Int,
    val localId: Int,
): UserLPUpdate() {
    companion object {
        val code = 14
        fun fromJsonArray(jsonArray: JsonArray): RestoreDialogMessagesUpdate {
            return RestoreDialogMessagesUpdate(
                peerId = jsonArray[0].jsonPrimitive.int,
                localId = jsonArray[1].jsonPrimitive.int,
            )
        }
    }
}
