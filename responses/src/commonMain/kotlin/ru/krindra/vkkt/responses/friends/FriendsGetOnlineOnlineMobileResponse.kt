package ru.krindra.vkkt.responses.friends

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.friends.*

/**
 * @param online 
 * @param onlineMobile 
 */
@Serializable
data class FriendsGetOnlineOnlineMobileResponse (
    @SerialName("online") val online: List<Int>,
    @SerialName("online_mobile") val onlineMobile: List<Int>,
)

