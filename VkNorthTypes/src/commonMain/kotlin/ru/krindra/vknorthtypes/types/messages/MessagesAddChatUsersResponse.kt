package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param failedPeerIds 
 * @param failedPhoneNumbers 
 * @param invitees 
 */
@Serializable
data class MessagesAddChatUsersResponse (
    @SerialName("invitees") val invitees: List<Int>,
    @SerialName("failed_peer_ids") val failedPeerIds: List<Int>,
    @SerialName("failed_phone_numbers") val failedPhoneNumbers: List<String>,
)

