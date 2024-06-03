package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param gid Community ID
 * @param hash Uploading hash
 * @param photo Uploaded photo data
 * @param server Upload server number
 */
@Serializable
data class PhotosMarketAlbumUploadResponse (
    @SerialName("gid") val gid: Long? = null,
    @SerialName("hash") val hash: String? = null,
    @SerialName("server") val server: Int? = null,
    @SerialName("photo") val photo: String? = null,
)

