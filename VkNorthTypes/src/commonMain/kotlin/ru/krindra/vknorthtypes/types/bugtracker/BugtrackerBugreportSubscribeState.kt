package ru.krindra.vknorthtypes.types.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param canSetSubscribe 
 * @param isSubscribed 
 * @param setSubscribeHash 
 */
@Serializable
data class BugtrackerBugreportSubscribeState (
    @SerialName("can_set_subscribe") val canSetSubscribe: Boolean,
    @SerialName("is_subscribed") val isSubscribed: Boolean? = null,
    @SerialName("set_subscribe_hash") val setSubscribeHash: String? = null,
)
