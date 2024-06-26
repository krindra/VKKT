package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vknorthtypes.longpoll.user.*

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
