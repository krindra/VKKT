package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Template action type names
 * 
 */
@Serializable
enum class MessagesTemplateActionTypeNames(val value: String){
    @SerialName("text") TEXT("text"),
    @SerialName("start") START("start"),
    @SerialName("location") LOCATION("location"),
    @SerialName("vkpay") VKPAY("vkpay"),
    @SerialName("open_app") OPEN_APP("open_app"),
    @SerialName("open_photo") OPEN_PHOTO("open_photo"),
    @SerialName("open_link") OPEN_LINK("open_link"),
    @SerialName("callback") CALLBACK("callback"),
    @SerialName("intent_subscribe") INTENT_SUBSCRIBE("intent_subscribe"),
    @SerialName("intent_unsubscribe") INTENT_UNSUBSCRIBE("intent_unsubscribe"),
    @SerialName("open_modal_view") OPEN_MODAL_VIEW("open_modal_view"),
}
