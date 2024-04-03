package ru.krindra.vknorthtypes.types.messages

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

import ru.krindra.vknorthtypes.types.users.UsersUserFull


@Serializable
data class MessagesGetLongPollHistoryResponse (
    val response: MessagesGetLongPollHistoryRawResponse
) {
    /**
     *
     * @param history 
     * @param messages 
     * @param credentials 
     * @param profiles 
     * @param groups 
     * @param chats 
     * @param newPts Persistence timestamp
     * @param fromPts 
     * @param more Has more
     * @param conversations 
     */
    @Serializable
    data class MessagesGetLongPollHistoryRawResponse (
        @SerialName("history") val history: List<List<JsonElement>>? = null,
        @SerialName("messages") val messages: MessagesLongpollMessages? = null,
        @SerialName("credentials") val credentials: MessagesLongpollParams? = null,
        @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
        @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
        @SerialName("chats") val chats: List<MessagesChat>? = null,
        @SerialName("new_pts") val newPts: Int? = null,
        @SerialName("from_pts") val fromPts: Int? = null,
        @SerialName("more") val more: Boolean? = null,
        @SerialName("conversations") val conversations: List<MessagesConversation>? = null,
    )
}
