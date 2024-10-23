package ru.krindra.vkkt.longpoll.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MessageInfo(
    @SerialName("client_platform_info") val clientPlatformInfo: String? = null,
    @SerialName("from") val from: String? = null,
    @SerialName("emoji") val emoji: String? = null,
)
