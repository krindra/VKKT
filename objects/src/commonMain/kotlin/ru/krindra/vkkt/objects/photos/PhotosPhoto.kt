package ru.krindra.vkkt.objects.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseObjectCount
import ru.krindra.vkkt.objects.base.BasePropertyExists
import ru.krindra.vkkt.objects.base.BaseRepostsInfo
import ru.krindra.vkkt.objects.base.BaseLikes
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param accessKey Access key for the photo
 * @param albumId Album ID
 * @param date Date when uploaded
 * @param height Original photo height
 * @param id Photo ID
 * @param images 
 * @param lat Latitude
 * @param long Intitude
 * @param ownerId Photo owner's ID
 * @param photo256 URL of image with 2560 px width
 * @param canComment Information whether current user can comment the photo
 * @param place 
 * @param postId Post ID
 * @param sizes 
 * @param squareCrop 
 * @param text Photo caption
 * @param userId ID of the user who have uploaded the photo
 * @param width Original photo width
 * @param hasTags Whether photo has attached tag links
 * @param likes 
 * @param comments 
 * @param reposts 
 * @param tags 
 * @param hidden Returns if the photo is hidden above the wall
 * @param realOffset Real position of the photo
 * @param verticalAlign Sets vertical alignment of a photo
 */
@Serializable
data class PhotosPhoto (
    @SerialName("id") val id: Int,
    @SerialName("album_id") val albumId: Int,
    @SerialName("owner_id") val ownerId: Int,
    @SerialName("lat") val lat: Double? = null,
    @SerialName("width") val width: Int? = null,
    @SerialName("has_tags") val hasTags: Boolean,
    @SerialName("long") val long: Double? = null,
    @SerialName("text") val text: String? = null,
    @SerialName("height") val height: Int? = null,
    @SerialName("place") val place: String? = null,
    @SerialName("post_id") val postId: Int? = null,
    @SerialName("user_id") val userId: Int? = null,
    @SerialName("likes") val likes: BaseLikes? = null,
    @SerialName("photo_256") val photo256: String? = null,
    @SerialName("tags") val tags: BaseObjectCount? = null,
    @SerialName("real_offset") val realOffset: Int? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("date") val date: Int/* WARN! Int? = null */,
    @SerialName("square_crop") val squareCrop: String? = null,
    @SerialName("images") val images: List<PhotosImage>? = null,
    @SerialName("reposts") val reposts: BaseRepostsInfo? = null,
    @SerialName("hidden") val hidden: BasePropertyExists? = null,
    @SerialName("comments") val comments: BaseObjectCount? = null,
    @SerialName("can_comment") val canComment: BaseBoolInt? = null,
    @SerialName("sizes") val sizes: List<PhotosPhotoSizes>? = null,
    @SerialName("vertical_align") val verticalAlign: String? = null,
)
