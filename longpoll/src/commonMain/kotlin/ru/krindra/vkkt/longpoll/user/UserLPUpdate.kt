package ru.krindra.vkkt.longpoll.user

import kotlinx.serialization.json.*
import ru.krindra.vkkt.utils.JsonSingleton

sealed class UserLPUpdate {

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

    data class ChangeMajorIdUpdate(
        val peerId: Int,
        val majorId: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 20
            fun fromJsonArray(jsonArray: JsonArray): ChangeMajorIdUpdate {
                return ChangeMajorIdUpdate(
                    peerId = jsonArray[0].jsonPrimitive.int,
                    majorId = jsonArray[1].jsonPrimitive.int,
                )
            }
        }
    }

    data class ChangeMinorIdUpdate(
        val peerId: Int,
        val minorId: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 21
            fun fromJsonArray(jsonArray: JsonArray): ChangeMinorIdUpdate {
                return ChangeMinorIdUpdate(
                    peerId = jsonArray[0].jsonPrimitive.int,
                    minorId = jsonArray[1].jsonPrimitive.int,
                )
            }
        }
    }

    data class ChatInfoChangedUpdate(
        val typeId: Int,
        val peerId: Int,
        val info: String,
    ): UserLPUpdate() {
        companion object {
            val code = 52
            fun fromJsonArray(jsonArray: JsonArray): ChatInfoChangedUpdate {
                return ChatInfoChangedUpdate(
                    typeId = jsonArray[0].jsonPrimitive.int,
                    peerId = jsonArray[1].jsonPrimitive.int,
                    info = jsonArray[2].jsonPrimitive.content,
                )
            }
        }
    }

    data class ChatSettingsChangeUpdate(
        val chatId: Int,
        val self: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 51
            fun fromJsonArray(jsonArray: JsonArray): ChatSettingsChangeUpdate {
                return ChatSettingsChangeUpdate(
                    chatId = jsonArray[0].jsonPrimitive.int,
                    self = jsonArray[1].jsonPrimitive.int,
                )
            }
        }
    }

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

    data class FriendOfflineUpdate(
        val userId: Int,
        val flags: Int,
        val timestamp: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 9
            fun fromJsonArray(jsonArray: JsonArray): FriendOfflineUpdate {
                return FriendOfflineUpdate(
                    userId = jsonArray[0].jsonPrimitive.int,
                    flags = jsonArray[1].jsonPrimitive.int,
                    timestamp = jsonArray[2].jsonPrimitive.int,
                )
            }
        }
    }

    data class FriendOnlineUpdate(
        val userId: Int,
        val isTimeout: Int,
        val timestamp: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 8
            fun fromJsonArray(jsonArray: JsonArray): FriendOnlineUpdate {
                return FriendOnlineUpdate(
                    userId = jsonArray[0].jsonPrimitive.int,
                    isTimeout = jsonArray[1].jsonPrimitive.int,
                    timestamp = jsonArray[2].jsonPrimitive.int,
                )
            }
        }
    }

    data class MessageEditUpdate(
        val messageId: Int,
        val mask: Int,
        val peerId: Int,
        val timestamp: Int,
        val newText: String,
        val attachments: Attachments,
    ): UserLPUpdate() {
        companion object {
            val code = 5
            fun fromJsonArray(jsonArray: JsonArray): MessageEditUpdate {
                return MessageEditUpdate(
                    messageId = jsonArray[0].jsonPrimitive.int,
                    mask = jsonArray[1].jsonPrimitive.int,
                    peerId = jsonArray[2].jsonPrimitive.int,
                    timestamp = jsonArray[3].jsonPrimitive.int,
                    newText = jsonArray[4].jsonPrimitive.content,
                    attachments = jsonArray[5].let { Attachments.fromJsonObject(it.jsonObject) },
                )
            }
        }
    }

    data class MessageNewUpdate(
        val messageId: Int,
        val flags: Int,
        val peerId: Int,
        val timestamp: Int,
        // extra fields
        val text: String = "",
        val info: MessageInfo? = null,
        val attachments: Attachments? = null,
        val randomId:Int? = null,
    ): UserLPUpdate() {
        companion object {
            val code = 4
            fun fromJsonArray(jsonArray: JsonArray): MessageNewUpdate {
                return MessageNewUpdate(
                    messageId = jsonArray[0].jsonPrimitive.int,
                    flags = jsonArray[1].jsonPrimitive.int,
                    peerId = jsonArray[2].jsonPrimitive.int,
                    timestamp = jsonArray[3].jsonPrimitive.int,

                    text = jsonArray.getOrNull(4)?.jsonPrimitive?.content ?: "",
                    info = jsonArray.getOrNull(5)
                        ?.let { JsonSingleton.json.decodeFromJsonElement(it) },
                    attachments = jsonArray.getOrNull(6)
                        .let { Attachments.fromJsonObject(it?.jsonObject) },
                    randomId = jsonArray.getOrNull(7)?.jsonPrimitive?.int,
                )
            }
        }
    }

    data class NotificationChangeUpdate(
        val peerId: Int,
        val sound: Int,
        val disabledUntil: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 114
            fun fromJsonArray(jsonArray: JsonArray): NotificationChangeUpdate {
                return NotificationChangeUpdate(
                    peerId = jsonArray[0].jsonPrimitive.int,
                    sound = jsonArray[1].jsonPrimitive.int,
                    disabledUntil = jsonArray[2].jsonPrimitive.int,
                )
            }
        }
    }

    data class ReadIncomingMessagesUpdate(
        val peerId: Int,
        val messageId: Int,
        val count: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 6
            fun fromJsonArray(jsonArray: JsonArray): ReadIncomingMessagesUpdate {
                return ReadIncomingMessagesUpdate(
                    peerId = jsonArray[0].jsonPrimitive.int,
                    messageId = jsonArray[1].jsonPrimitive.int,
                    count = jsonArray[2].jsonPrimitive.int,
                )
            }
        }
    }

    data class ReadOutgoingMessagesUpdate(
        val peerId: Int,
        val messageId: Int,
        val count: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 7
            fun fromJsonArray(jsonArray: JsonArray): ReadOutgoingMessagesUpdate {
                return ReadOutgoingMessagesUpdate(
                    peerId = jsonArray[0].jsonPrimitive.int,
                    messageId = jsonArray[1].jsonPrimitive.int,
                    count = jsonArray[2].jsonPrimitive.int,
                )
            }
        }
    }

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

    data class ReplaceMessageFlagsUpdate(
        val messageId: Int,
        val flags: Int,
        val peerId: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 1
            fun fromJsonArray(jsonArray: JsonArray): ReplaceMessageFlagsUpdate {
                return ReplaceMessageFlagsUpdate(
                    messageId = jsonArray[0].jsonPrimitive.int,
                    flags = jsonArray[1].jsonPrimitive.int,
                    peerId = jsonArray[2].jsonPrimitive.int,
                )
            }
        }
    }

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

    data class ResetMessageFlagsUpdate(
        val messageId: Int,
        val mask: Int,
        val peerId: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 3
            fun fromJsonArray(jsonArray: JsonArray): ResetMessageFlagsUpdate {
                return ResetMessageFlagsUpdate(
                    messageId = jsonArray[0].jsonPrimitive.int,
                    mask = jsonArray[1].jsonPrimitive.int,
                    peerId = jsonArray[2].jsonPrimitive.int,
                )
            }
        }
    }

    data class RestoreDialogMessagesUpdate(
        val peerId: Int,
        val messageId: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 14
            fun fromJsonArray(jsonArray: JsonArray): RestoreDialogMessagesUpdate {
                return RestoreDialogMessagesUpdate(
                    peerId = jsonArray[0].jsonPrimitive.int,
                    messageId = jsonArray[1].jsonPrimitive.int,
                )
            }
        }
    }

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

    data class SetMessageFlagsUpdate(
        val messageId: Int,
        val mask: Int,
        val peerId: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 2
            fun fromJsonArray(jsonArray: JsonArray): SetMessageFlagsUpdate {
                return SetMessageFlagsUpdate(
                    messageId = jsonArray[0].jsonPrimitive.int,
                    mask = jsonArray[1].jsonPrimitive.int,
                    peerId = jsonArray[2].jsonPrimitive.int,
                )
            }
        }
    }

    data class UserCallUpdate(
        val userId: Int,
        val callId: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 70
            fun fromJsonArray(jsonArray: JsonArray): UserCallUpdate {
                return UserCallUpdate(
                    userId = jsonArray[0].jsonPrimitive.int,
                    callId = jsonArray[1].jsonPrimitive.int,
                )
            }
        }
    }

    data class UsersFileUploadingUpdate(
        val peerId: Int,
        val userIds: List<Int>,
        val totalCount: Int,
        val ts: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 67
            fun fromJsonArray(jsonArray: JsonArray): UsersFileUploadingUpdate {
                return UsersFileUploadingUpdate(
                    peerId = jsonArray[0].jsonPrimitive.int,
                    userIds = jsonArray[1].jsonArray.map { it.jsonPrimitive.int },
                    totalCount = jsonArray[2].jsonPrimitive.int,
                    ts = jsonArray[3].jsonPrimitive.int,
                )
            }
        }
    }

    data class UsersPhotoUploadingUpdate(
        val peerId: Int,
        val userIds: List<Int>,
        val totalCount: Int,
        val ts: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 65
            fun fromJsonArray(jsonArray: JsonArray): UsersPhotoUploadingUpdate {
                return UsersPhotoUploadingUpdate(
                    peerId = jsonArray[0].jsonPrimitive.int,
                    userIds = jsonArray[1].jsonArray.map { it.jsonPrimitive.int },
                    totalCount = jsonArray[2].jsonPrimitive.int,
                    ts = jsonArray[3].jsonPrimitive.int,
                )
            }
        }
    }

    data class UsersTypingInChatUpdate(
        val peerId: Int,
        val userIds: List<Int>,
        val totalCount: Int,
        val ts: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 63
            fun fromJsonArray(jsonArray: JsonArray): UsersTypingInChatUpdate {
                return UsersTypingInChatUpdate(
                    peerId = jsonArray[0].jsonPrimitive.int,
                    userIds = jsonArray[1].jsonArray.map { it.jsonPrimitive.int },
                    totalCount = jsonArray[2].jsonPrimitive.int,
                    ts = jsonArray[3].jsonPrimitive.int,
                )
            }
        }
    }

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

    data class UsersVoiceRecordingUpdate(
        val peerId: Int,
        val userIds: List<Int>,
        val totalCount: Int,
        val ts: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 64
            fun fromJsonArray(jsonArray: JsonArray): UsersVoiceRecordingUpdate {
                return UsersVoiceRecordingUpdate(
                    peerId = jsonArray[0].jsonPrimitive.int,
                    userIds = jsonArray[1].jsonArray.map { it.jsonPrimitive.int },
                    totalCount = jsonArray[2].jsonPrimitive.int,
                    ts = jsonArray[3].jsonPrimitive.int,
                )
            }
        }
    }

    data class UserTypingInChatUpdate(
        val userId: Int,
        val chatId: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 62
            fun fromJsonArray(jsonArray: JsonArray): UserTypingInChatUpdate {
                return UserTypingInChatUpdate(
                    userId = jsonArray[0].jsonPrimitive.int,
                    chatId = jsonArray[1].jsonPrimitive.int,
                )
            }
        }
    }

    data class UserTypingInDialogUpdate(
        val userId: Int,
        val flags: Int,
    ): UserLPUpdate() {
        companion object {
            val code = 61
            fun fromJsonArray(jsonArray: JsonArray): UserTypingInDialogUpdate {
                return UserTypingInDialogUpdate(
                    userId = jsonArray[0].jsonPrimitive.int,
                    flags = jsonArray[1].jsonPrimitive.int,
                )
            }
        }
    }

    data class UnknownUpdate(
        val id: Int,
        val raw: JsonArray
    ): UserLPUpdate()

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