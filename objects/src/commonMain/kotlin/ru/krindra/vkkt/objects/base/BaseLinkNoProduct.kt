package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.link.LinkTargetObject
import ru.krindra.vkkt.objects.photos.PhotosPhoto
import ru.krindra.vkkt.objects.video.VideoVideoFull

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
    @SerialName("url") val url: String,
    @SerialName("id") val id: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("caption") val caption: String? = null,
    @SerialName("photo") val photo: PhotosPhoto? = null,
    @SerialName("video") val video: VideoVideoFull? = null,
    @SerialName("button") val button: BaseLinkButton? = null,
    @SerialName("rating") val rating: BaseLinkRating? = null,
    @SerialName("preview_url") val previewUrl: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("is_external") val isExternal: Boolean? = null,
    @SerialName("is_favorite") val isFavorite: Boolean? = null,
    @SerialName("preview_page") val previewPage: String? = null,
    @SerialName("application") val application: BaseLinkApplication? = null,
    @SerialName("target_object") val targetObject: LinkTargetObject? = null,
)
