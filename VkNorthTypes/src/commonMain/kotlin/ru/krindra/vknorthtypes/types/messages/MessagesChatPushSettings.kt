package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param disabledUntil Time until that notifications are disabled
 * @param sound Information whether the sound is on
 */
@Serializable
data class MessagesChatPushSettings (
    @SerialName("sound") val sound: BaseBoolInt? = null,
    @SerialName("disabled_until") val disabledUntil: Int? = null,
)
