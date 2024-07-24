package ru.krindra.vkkt.objects.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param albumId Album ID
 * @param uploadUrl URL to upload photo
 * @param fallbackUploadUrl Fallback URL if upload_url returned error
 * @param userId User ID
 * @param groupId Group ID
 */
@Serializable
data class PhotosPhotoUpload (
    @SerialName("user_id") val userId: Int,
    @SerialName("album_id") val albumId: Int,
    @SerialName("upload_url") val uploadUrl: String,
    @SerialName("group_id") val groupId: Int? = null,
    @SerialName("fallback_upload_url") val fallbackUploadUrl: String? = null,
)
