package ru.krindra.vkkt.longpoll.user.updates

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.int
import kotlinx.serialization.json.jsonPrimitive

sealed class UserLPUpdate {
    companion object {
        fun fromJsonArray(jsonArray: JsonArray): UserLPUpdate {
            val id = jsonArray[0].jsonPrimitive.int
            val list = JsonArray(jsonArray.drop(1))
            return when (id) {
                1 -> ReplaceMessageFlagsUpdate.fromJsonArray(list)
                2 -> SetMessageFlagsUpdate.fromJsonArray(list)
                3 -> ResetMessageFlagsUpdate.fromJsonArray(list)
                4 -> MessageNewUpdate.fromJsonArray(list)
                5 -> MessageEditUpdate.fromJsonArray(list)
                6 -> ReadIncomingMessagesUpdate.fromJsonArray(list)
                7 -> ReadOutgoingMessagesUpdate.fromJsonArray(list)
                8 -> FriendOnlineUpdate.fromJsonArray(list)
                9 -> FriendOfflineUpdate.fromJsonArray(list)
                10 -> ResetDialogFlagsUpdate.fromJsonArray(list)
                11 -> ReplaceDialogFlagsUpdate.fromJsonArray(list)
                12 -> SetDialogFlagsUpdate.fromJsonArray(list)
                13 -> DeleteDialogMessagesUpdate.fromJsonArray(list)
                14 -> RestoreDialogMessagesUpdate.fromJsonArray(list)
                20 -> ChangeMajorIdUpdate.fromJsonArray(list)
                21 -> ChangeMinorIdUpdate.fromJsonArray(list)
                51 -> ChatSettingsChangeUpdate.fromJsonArray(list)
                52 -> ChatInfoChangedUpdate.fromJsonArray(list)
                61 -> UserTypingInDialogUpdate.fromJsonArray(list)
                62 -> UserTypingInChatUpdate.fromJsonArray(list)
                63 -> UsersTypingInChatUpdate.fromJsonArray(list)
                64 -> UsersVoiceRecordingUpdate.fromJsonArray(list)
                65 -> UsersPhotoUploadingUpdate.fromJsonArray(list)
                66 -> UsersVideoUploadingUpdate.fromJsonArray(list)
                67 -> UsersFileUploadingUpdate.fromJsonArray(list)
                70 -> UserCallUpdate.fromJsonArray(list)
                80 -> ChangeCountOfUnreadDialogsUpdate.fromJsonArray(list)
                114 -> NotificationChangeUpdate.fromJsonArray(list)
                else -> UnknownUpdate(id, jsonArray)
            }
        }
    }
}