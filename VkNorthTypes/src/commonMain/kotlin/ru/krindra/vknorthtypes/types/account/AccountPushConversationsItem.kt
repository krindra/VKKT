package ru.krindra.vknorthtypes.types.account

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param disabledUntil Time until that notifications are disabled in seconds
 * @param peerId Peer ID
 * @param sound Information whether the sound are enabled
 * @param disabledMentions Information whether the mentions are disabled
 * @param disabledMassMentions Information whether the mass mentions (like '@all', '@online') are disabled. Can be affected by 'disabled_mentions'
 */
@Serializable
data class AccountPushConversationsItem (
    @SerialName("peer_id") val peerId: Long,
    @SerialName("sound") val sound: BaseBoolInt,
    @SerialName("disabled_until") val disabledUntil: Int,
    @SerialName("disabled_mentions") val disabledMentions: BaseBoolInt? = null,
    @SerialName("disabled_mass_mentions") val disabledMassMentions: BaseBoolInt? = null,
)
