package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseLink

/**
 *
 * @param data Additional data
 * @param platform Platform name
 * @param type 
 * @param url URL to an external site used to publish the post
 * @param link 
 */
@Serializable
data class WallPostSource (
    @SerialName("url") val url: String? = null,
    @SerialName("data") val data: String? = null,
    @SerialName("link") val link: BaseLink? = null,
    @SerialName("platform") val platform: String? = null,
    @SerialName("type") val type: WallPostSourceType? = null,
)
