package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Description of the action, that should be performed on button click
 * 
 * @param payload Additional data sent along with message for developer convenience
 * @param type 
 */
@Serializable
data class MessagesKeyboardButtonActionLocation (
    @SerialName("payload") val payload: String? = null,
    @SerialName("type") val type: String,
)
