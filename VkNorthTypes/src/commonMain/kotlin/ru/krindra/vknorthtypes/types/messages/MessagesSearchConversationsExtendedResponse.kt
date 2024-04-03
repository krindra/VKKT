package ru.krindra.vknorthtypes.types.messages

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.groups.GroupsGroupFull

import ru.krindra.vknorthtypes.types.users.UsersUserFull


@Serializable
data class MessagesSearchConversationsExtendedResponse (
    val response: MessagesSearchConversationsExtendedRawResponse
) {
    /**
     *
     * @param count Total results number
     * @param items 
     * @param profiles 
     * @param groups 
     */
    @Serializable
    data class MessagesSearchConversationsExtendedRawResponse (
        @SerialName("count") val count: Int,
        @SerialName("items") val items: List<MessagesConversation>,
        @SerialName("profiles") val profiles: List<UsersUserFull>? = null,
        @SerialName("groups") val groups: List<GroupsGroupFull>? = null,
    )
}
