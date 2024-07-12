package ru.krindra.vkkt.responses.likes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.likes.*

/**
 * @param liked Information whether user liked the object
 * @param copied Information whether user reposted the object
 */
@Serializable
data class LikesIsLikedResponse (
    @SerialName("liked") val liked: BaseBoolInt,
    @SerialName("copied") val copied: BaseBoolInt,
)

