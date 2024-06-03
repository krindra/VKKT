package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param action 
 * @param color Button color
 */
@Serializable
data class MessagesKeyboardButton (
    @SerialName("color") val color: String? = null,
    @SerialName("action") val action: MessagesKeyboardButtonPropertyAction,
)
