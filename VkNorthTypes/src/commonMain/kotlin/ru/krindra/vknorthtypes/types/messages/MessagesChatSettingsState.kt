package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class MessagesChatSettingsState(val value: String){
    @SerialName("in") IN_("in"),
    @SerialName("kicked") KICKED("kicked"),
    @SerialName("left") LEFT("left"),
    @SerialName("out") OUT("out"),
}
