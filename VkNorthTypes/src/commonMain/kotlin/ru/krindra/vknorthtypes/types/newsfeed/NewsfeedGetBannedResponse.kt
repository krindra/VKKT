package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param groups 
 * @param members 
 */
@Serializable
data class NewsfeedGetBannedResponse (
    @SerialName("groups") val groups: List<Int>? = null,
    @SerialName("members") val members: List<Int>? = null,
)

