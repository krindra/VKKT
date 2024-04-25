package ru.krindra.vknorthtypes.longpoll.bot.objects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.*
import ru.krindra.vknorthtypes.types.photos.PhotosImage
import ru.krindra.vknorthtypes.types.photos.PhotosPhotoSizes

@Serializable
data class PhotoNewObject(
    @SerialName("long") val long: Double? = null,
    @SerialName("square_crop") val squareCrop: String? = null,
    @SerialName("sizes") val sizes: List<PhotosPhotoSizes>? = null,
    @SerialName("place") val place: String? = null,
    @SerialName("can_comment") val canComment: BaseBoolInt? = null,
    @SerialName("photo_256") val photo256: String? = null,
    @SerialName("real_offset") val realOffset: Int? = null,
    @SerialName("height") val height: Int? = null,
    @SerialName("tags") val tags: BaseObjectCount? = null,
    @SerialName("access_key") val accessKey: String? = null,
    @SerialName("date") val date: Int/* WARN! Int? = null */,
    @SerialName("has_tags") val hasTags: Boolean,
    @SerialName("comments") val comments: BaseObjectCount? = null,
    @SerialName("reposts") val reposts: BaseRepostsInfo? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("lat") val lat: Double? = null,
    @SerialName("images") val images: List<PhotosImage>? = null,
    @SerialName("hidden") val hidden: BasePropertyExists? = null,
    @SerialName("width") val width: Int? = null,
    @SerialName("post_id") val postId: Long? = null,
    @SerialName("likes") val likes: BaseLikes? = null,
    @SerialName("vertical_align") val verticalAlign: String? = null,
    @SerialName("id") val id: Long,
    @SerialName("text") val text: String? = null,
    @SerialName("user_id") val userId: Long? = null,
    @SerialName("album_id") val albumId: Long,
)