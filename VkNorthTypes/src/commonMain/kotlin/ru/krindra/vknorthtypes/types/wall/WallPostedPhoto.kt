package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Photo ID
 * @param ownerId Photo owner's ID
 * @param photo130 URL of the preview image with 130 px in width
 * @param photo604 URL of the preview image with 604 px in width
 */
@Serializable
data class WallPostedPhoto (
    @SerialName("id") val id: Long? = null,
    @SerialName("owner_id") val ownerId: Long? = null,
    @SerialName("photo_130") val photo130: String? = null,
    @SerialName("photo_604") val photo604: String? = null,
)
