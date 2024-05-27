package ru.krindra.vknorthtypes.types.likes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param likes Total likes number
 */
@Serializable
data class LikesAddResponse (
    @SerialName("likes") val likes: Int,
)

