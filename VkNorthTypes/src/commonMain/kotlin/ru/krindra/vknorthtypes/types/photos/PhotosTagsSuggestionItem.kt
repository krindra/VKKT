package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param title 
 * @param caption 
 * @param type 
 * @param buttons 
 * @param photo 
 * @param tags 
 * @param trackCode 
 */
@Serializable
data class PhotosTagsSuggestionItem (
    @SerialName("type") val type: String? = null,
    @SerialName("caption") val caption: String? = null,
    @SerialName("photo") val photo: PhotosPhoto? = null,
    @SerialName("buttons") val buttons: List<PhotosTagsSuggestionItemButton>? = null,
    @SerialName("tags") val tags: List<PhotosPhotoTag>? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("track_code") val trackCode: String? = null,
)
