package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vknorthtypes.longpoll.user.*

data class DeleteDialogMessagesUpdate(
    val peerId: Int,
    val messageId: Int,
): UserLPUpdate() {
    companion object {
        val code = 13
        fun fromJsonArray(jsonArray: JsonArray): DeleteDialogMessagesUpdate {
            return DeleteDialogMessagesUpdate(
                peerId = jsonArray[0].jsonPrimitive.int,
                messageId = jsonArray[1].jsonPrimitive.int,
            )
        }
    }
}
