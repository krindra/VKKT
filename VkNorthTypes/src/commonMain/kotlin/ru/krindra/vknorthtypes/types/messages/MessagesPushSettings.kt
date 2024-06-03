package ru.krindra.vknorthtypes.types.messages

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param disabledForever Information whether push notifications are disabled forever
 * @param disabledUntil Time until what notifications are disabled
 * @param noSound Information whether the sound is on
 * @param disabledMentions Information whether the mentions are disabled
 * @param disabledMassMentions Information whether the mass mentions (like '@all', '@online') are disabled
 */
@Serializable
data class MessagesPushSettings (
    @SerialName("no_sound") val noSound: Boolean,
    @SerialName("disabled_forever") val disabledForever: Boolean,
    @SerialName("disabled_until") val disabledUntil: Int? = null,
    @SerialName("disabled_mentions") val disabledMentions: Boolean? = null,
    @SerialName("disabled_mass_mentions") val disabledMassMentions: Boolean? = null,
)
