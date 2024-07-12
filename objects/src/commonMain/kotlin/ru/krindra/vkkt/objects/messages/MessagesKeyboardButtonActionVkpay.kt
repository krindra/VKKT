package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Description of the action, that should be performed on button click
 * 
 * @param hash Fragment value in app link like vk.com/app123456_-654321#{hash}
 * @param payload Additional data sent along with message for developer convenience
 * @param type 
 */
@Serializable
data class MessagesKeyboardButtonActionVkpay (
    @SerialName("hash") val hash: String,
    @SerialName("type") val type: String,
    @SerialName("payload") val payload: String? = null,
)
