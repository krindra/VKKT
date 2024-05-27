package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.link.LinkTargetObject
import ru.krindra.vknorthtypes.types.video.VideoVideoFull
import ru.krindra.vknorthtypes.types.photos.PhotosPhoto

/**
 *
 * @param application 
 * @param button 
 * @param caption Link caption
 * @param description Link description
 * @param id Link ID
 * @param isFavorite 
 * @param photo 
 * @param previewPage String ID of the page with article preview
 * @param previewUrl URL of the page with article preview
 * @param rating 
 * @param title Link title
 * @param url Link URL
 * @param targetObject 
 * @param isExternal Information whether the current link is external
 * @param video Video from link
 */
@Serializable
data class BaseLinkNoProduct (
    @SerialName("video") val video: VideoVideoFull? = null,
    @SerialName("preview_url") val previewUrl: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("caption") val caption: String? = null,
    @SerialName("button") val button: BaseLinkButton? = null,
    @SerialName("url") val url: String,
    @SerialName("is_external") val isExternal: Boolean? = null,
    @SerialName("preview_page") val previewPage: String? = null,
    @SerialName("application") val application: BaseLinkApplication? = null,
    @SerialName("target_object") val targetObject: LinkTargetObject? = null,
    @SerialName("is_favorite") val isFavorite: Boolean? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("photo") val photo: PhotosPhoto? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("rating") val rating: BaseLinkRating? = null,
)
