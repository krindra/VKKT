package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.*
import ru.krindra.vknorthtypes.longpoll.user.*

data class UsersVideoUploadingUpdate(
    val peerId: Int,
    val userIds: List<Int>,
    val totalCount: Int,
    val ts: Int,
): UserLPUpdate() {
    companion object {
        val code = 66
        fun fromJsonArray(jsonArray: JsonArray): UsersVideoUploadingUpdate {
            return UsersVideoUploadingUpdate(
                peerId = jsonArray[0].jsonPrimitive.int,
                userIds = jsonArray[1].jsonArray.map { it.jsonPrimitive.int },
                totalCount = jsonArray[2].jsonPrimitive.int,
                ts = jsonArray[3].jsonPrimitive.int,
            )
        }
    }
}
