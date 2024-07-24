package ru.krindra.vkkt.objects.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param accessKey Access key for the photo
 * @param albumId Album ID
 * @param date Date when uploaded
 * @param height Original photo height
 * @param id Photo ID
 * @param lat Latitude
 * @param long Longitude
 * @param ownerId Photo owner's ID
 * @param photo1280 URL of image with 1280 px width
 * @param photo130 URL of image with 130 px width
 * @param photo2560 URL of image with 2560 px width
 * @param photo604 URL of image with 604 px width
 * @param photo75 URL of image with 75 px width
 * @param photo807 URL of image with 807 px width
 * @param placerId ID of the tag creator
 * @param postId Post ID
 * @param sizes 
 * @param tagCreated Date when tag has been added in Unixtime
 * @param tagId Tag ID
 * @param text Photo caption
 * @param userId ID of the user who have uploaded the photo
 * @param width Original photo width
 * @param hasTags Whether photo has attached tag links
 */
@Serializable
data class PhotosPhotoXtrTagInfo (
    @SerialName("id") val id: Int,
    @SerialName("date") val date: Int,
    @SerialName("album_id") val albumId: Int,
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("lat") val lat: Double? = null,
    @SerialName("width") val width: Int? = null,
    @SerialName("long") val long: Double? = null,
    @SerialName("tag_id") val tagId: Int? = null,
    @SerialName("text") val text: String? = null,
    @SerialName("height") val height: Int? = null,
    @SerialName("post_id") val postId: Int? = null,
    @SerialName("user_id") val userId: Int? = null,
    @SerialName("placer_id") val placerId: Int? = null,
    @SerialName("photo_75") val photo75: String? = null,
    @SerialName("has_tags") val hasTags: Boolean? = null,
    @SerialName("photo_130") val photo130: String? = null,
    @SerialName("photo_604") val photo604: String? = null,
    @SerialName("photo_807") val photo807: String? = null,
    @SerialName("tag_created") val tagCreated: Int? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("photo_1280") val photo1280: String? = null,
    @SerialName("photo_2560") val photo2560: String? = null,
    @SerialName("sizes") val sizes: List<PhotosPhotoSizes>? = null,
)
