package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Declares state if market is enabled in group.
 * 
 */
@Serializable
enum class GroupsMarketState(val value: String){
    @SerialName("none") NONE("none"),
    @SerialName("basic") BASIC("basic"),
    @SerialName("advanced") ADVANCED("advanced"),
}
