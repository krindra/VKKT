package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class ChangeCountOfUnreadDialogsUpdate(
    val count: Int,
): UserLPUpdate() {
    companion object {
        val code = 80
        fun fromJsonArray(jsonArray: JsonArray): ChangeCountOfUnreadDialogsUpdate {
            return ChangeCountOfUnreadDialogsUpdate(
                count = jsonArray[0].jsonPrimitive.int,
            )
        }
    }
}
