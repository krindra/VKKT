package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param hash Uploading hash
 * @param photo Uploaded photo data
 * @param server Upload server number
 */
@Serializable
data class PhotosOwnerUploadResponse (
    @SerialName("hash") val hash: String? = null,
    @SerialName("server") val server: Int? = null,
    @SerialName("photo") val photo: String? = null,
)

