package ru.krindra.vknorthtypes.types.photos

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PhotosWallUploadResponse (
    val response: PhotosWallUploadRawResponse
) {
    /**
     *
     * @param hash Uploading hash
     * @param photo Uploaded photo data
     * @param server Upload server number
     */
    @Serializable
    data class PhotosWallUploadRawResponse (
        @SerialName("hash") val hash: String? = null,
        @SerialName("photo") val photo: String? = null,
        @SerialName("server") val server: Int? = null,
    )
}
