package ru.krindra.vkkt.objects.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Description of the action, that should be performed on button click
 * 
 * @param appId Fragment value in app link like vk.com/app{app_id}_-654321#hash
 * @param hash Fragment value in app link like vk.com/app123456_-654321#{hash}
 * @param label Label for button
 * @param ownerId Fragment value in app link like vk.com/app123456_{owner_id}#hash
 * @param payload Additional data sent along with message for developer convenience
 * @param type 
 */
@Serializable
data class MessagesKeyboardButtonActionOpenApp (
    @SerialName("type") val type: String,
    @SerialName("app_id") val appId: Int,
    @SerialName("label") val label: String,
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("hash") val hash: String? = null,
    @SerialName("payload") val payload: String? = null,
)
