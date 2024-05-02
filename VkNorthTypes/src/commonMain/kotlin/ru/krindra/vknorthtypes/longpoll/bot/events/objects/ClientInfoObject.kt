package ru.krindra.vknorthtypes.longpoll.bot.events.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ClientInfoObject(
    @SerialName("button_actions") val buttonActions: List<String>,
    @SerialName("keyboard") val keyboard: Boolean,
    @SerialName("inline_keyboard") val inlineKeyboard: Boolean,
    @SerialName("carousel") val carousel: Boolean,
    @SerialName("lang_id") val langId: Int,
)