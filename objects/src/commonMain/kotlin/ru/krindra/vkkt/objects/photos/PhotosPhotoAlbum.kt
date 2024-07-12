package ru.krindra.vkkt.objects.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param created Date when the album has been created in Unixtime
 * @param description Photo album description
 * @param id Photo album ID
 * @param ownerId Album owner's ID
 * @param size Photos number
 * @param thumb 
 * @param title Photo album title
 * @param updated Date when the album has been updated last time in Unixtime
 */
@Serializable
data class PhotosPhotoAlbum (
    @SerialName("id") val id: Long,
    @SerialName("size") val size: Int,
    @SerialName("title") val title: String,
    @SerialName("created") val created: Int,
    @SerialName("updated") val updated: Int,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("thumb") val thumb: PhotosPhoto? = null,
    @SerialName("description") val description: String? = null,
)
