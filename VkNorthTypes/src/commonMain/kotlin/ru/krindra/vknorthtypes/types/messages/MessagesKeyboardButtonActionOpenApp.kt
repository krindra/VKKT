package ru.krindra.vknorthtypes.types.messages

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
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("app_id") val appId: Long,
    @SerialName("label") val label: String,
    @SerialName("type") val type: String,
    @SerialName("payload") val payload: String? = null,
    @SerialName("hash") val hash: String? = null,
)
