package ru.krindra.vkkt.objects.client

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.messages.MessagesTemplateActionTypeNames

/**
 *
 * @param buttonActions 
 * @param keyboard client has support keyboard
 * @param inlineKeyboard client has support inline keyboard
 * @param carousel client has support carousel
 * @param langId client or user language id
 */
@Serializable
data class ClientInfoForBots (
    @SerialName("lang_id") val langId: Int? = null,
    @SerialName("carousel") val carousel: Boolean? = null,
    @SerialName("keyboard") val keyboard: Boolean? = null,
    @SerialName("inline_keyboard") val inlineKeyboard: Boolean? = null,
    @SerialName("button_actions") val buttonActions: List<MessagesTemplateActionTypeNames>? = null,
)
