package ru.krindra.vkkt.responses.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.photos.*

/**
 * @param aid Album ID
 * @param hash Uploading hash
 * @param photo Uploaded photo data
 * @param photosList Uploaded photos data
 * @param server Upload server number
 */
@Serializable
data class PhotosPhotoUploadResponse (
    @SerialName("aid") val aid: Long? = null,
    @SerialName("hash") val hash: String? = null,
    @SerialName("server") val server: Int? = null,
    @SerialName("photo") val photo: String? = null,
    @SerialName("photos_list") val photosList: String? = null,
)

