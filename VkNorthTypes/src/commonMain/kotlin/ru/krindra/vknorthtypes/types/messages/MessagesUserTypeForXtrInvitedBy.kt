package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Object type
 * 
 */
@Serializable
enum class MessagesUserTypeForXtrInvitedBy(val value: String){
    @SerialName("profile") PROFILE("profile"),
    @SerialName("group") GROUP("group"),
}
