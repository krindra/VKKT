package ru.krindra.vkkt.responses.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.photos.*

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

