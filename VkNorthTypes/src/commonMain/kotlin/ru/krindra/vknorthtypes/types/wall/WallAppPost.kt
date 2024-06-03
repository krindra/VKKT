package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Application ID
 * @param name Application name
 * @param photo130 URL of the preview image with 130 px in width
 * @param photo604 URL of the preview image with 604 px in width
 */
@Serializable
data class WallAppPost (
    @SerialName("id") val id: Long? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("photo_130") val photo130: String? = null,
    @SerialName("photo_604") val photo604: String? = null,
)
