package ru.krindra.vkkt.responses.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.photos.*

/**
 * @param hash Uploading hash
 * @param photo Uploaded photo data
 */
@Serializable
data class PhotosOwnerCoverUploadResponse (
    @SerialName("hash") val hash: String? = null,
    @SerialName("photo") val photo: String? = null,
)

