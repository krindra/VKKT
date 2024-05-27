package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param hash Uploading hash
 * @param photo Uploaded photo data
 */
@Serializable
data class PhotosOwnerCoverUploadResponse (
    @SerialName("hash") val hash: String? = null,
    @SerialName("photo") val photo: String? = null,
)

