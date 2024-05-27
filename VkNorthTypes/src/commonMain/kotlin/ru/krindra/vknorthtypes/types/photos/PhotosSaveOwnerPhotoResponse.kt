package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param photoHash Photo hash
 * @param photoSrc Uploaded image url
 * @param photoSrcBig Uploaded image url
 * @param photoSrcSmall Uploaded image url
 * @param saved Returns 1 if profile photo is saved
 * @param postId Created post ID
 */
@Serializable
data class PhotosSaveOwnerPhotoResponse (
    @SerialName("photo_hash") val photoHash: String,
    @SerialName("photo_src") val photoSrc: String,
    @SerialName("photo_src_big") val photoSrcBig: String? = null,
    @SerialName("photo_src_small") val photoSrcSmall: String? = null,
    @SerialName("saved") val saved: Int? = null,
    @SerialName("post_id") val postId: Long? = null,
)

