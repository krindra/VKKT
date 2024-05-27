package ru.krindra.vknorthtypes.types.likes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt


/**
 * @param liked Information whether user liked the object
 * @param copied Information whether user reposted the object
 */
@Serializable
data class LikesIsLikedResponse (
    @SerialName("liked") val liked: BaseBoolInt,
    @SerialName("copied") val copied: BaseBoolInt,
)

