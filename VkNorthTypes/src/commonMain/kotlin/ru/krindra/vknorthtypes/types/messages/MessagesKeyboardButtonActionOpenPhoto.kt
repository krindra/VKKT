package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Description of the action, that should be performed on button click
 * 
 * @param type 
 */
@Serializable
data class MessagesKeyboardButtonActionOpenPhoto (
    @SerialName("type") val type: String,
)
