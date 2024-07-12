package ru.krindra.vkkt.objects.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param disabled Information whether notifications are disabled
 * @param disabledUntil Time until that notifications are disabled in Unixtime
 * @param settings 
 * @param conversations 
 */
@Serializable
data class AccountPushSettings (
    @SerialName("disabled") val disabled: BaseBoolInt? = null,
    @SerialName("disabled_until") val disabledUntil: Int? = null,
    @SerialName("settings") val settings: AccountPushParams? = null,
    @SerialName("conversations") val conversations: AccountPushConversations? = null,
)
