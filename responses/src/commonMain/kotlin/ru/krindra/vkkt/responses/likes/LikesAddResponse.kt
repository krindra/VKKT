package ru.krindra.vkkt.responses.likes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.likes.*

/**
 * @param likes Total likes number
 */
@Serializable
data class LikesAddResponse (
    @SerialName("likes") val likes: Int,
)

