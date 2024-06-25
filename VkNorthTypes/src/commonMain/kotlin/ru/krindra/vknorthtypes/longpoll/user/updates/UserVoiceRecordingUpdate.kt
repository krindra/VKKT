package ru.krindra.vknorthtypes.longpoll.user.updates

import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int

data class UserVoiceRecordingUpdate(
    val userIds: Int,
    val peerId: Int,
    val totalCount: Int,
    val ts: Int,
): UserLPUpdate() {
    companion object {
        val code = 64
        fun fromJsonArray(jsonArray: JsonArray): UserVoiceRecordingUpdate {
            return UserVoiceRecordingUpdate(
                userIds = jsonArray[0].jsonPrimitive.int,
                peerId = jsonArray[1].jsonPrimitive.int,
                totalCount = jsonArray[2].jsonPrimitive.int,
                ts = jsonArray[3].jsonPrimitive.int,
            )
        }
    }
}
