package ru.krindra.vknorthtypes.types.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param online 
 * @param onlineMobile 
 */
@Serializable
data class FriendsGetOnlineOnlineMobileResponse (
    @SerialName("online") val online: List<Int>,
    @SerialName("online_mobile") val onlineMobile: List<Int>,
)

