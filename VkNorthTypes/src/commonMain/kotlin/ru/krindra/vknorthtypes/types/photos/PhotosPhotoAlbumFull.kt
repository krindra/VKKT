package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param canUpload Information whether current user can upload photo to the album
 * @param commentsDisabled Information whether album comments are disabled
 * @param created Date when the album has been created in Unixtime, not set for system albums
 * @param description Photo album description
 * @param canDelete album can delete
 * @param id Photo album ID
 * @param canIncludeToFeed album can be selected to feed
 * @param ownerId Album owner's ID
 * @param size Photos number
 * @param sizes 
 * @param thumbId Thumb photo ID
 * @param thumbIsLast Information whether the album thumb is last photo
 * @param thumbSrc URL of the thumb image
 * @param title Photo album title
 * @param updated Date when the album has been updated last time in Unixtime, not set for system albums
 * @param uploadByAdminsOnly Information whether only community administrators can upload photos
 */
@Serializable
data class PhotosPhotoAlbumFull (
    @SerialName("upload_by_admins_only") val uploadByAdminsOnly: BaseBoolInt? = null,
    @SerialName("title") val title: String,
    @SerialName("comments_disabled") val commentsDisabled: BaseBoolInt? = null,
    @SerialName("id") val id: Long,
    @SerialName("thumb_is_last") val thumbIsLast: BaseBoolInt? = null,
    @SerialName("can_upload") val canUpload: BaseBoolInt? = null,
    @SerialName("updated") val updated: Int? = null,
    @SerialName("can_include_to_feed") val canIncludeToFeed: Boolean? = null,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("thumb_src") val thumbSrc: String? = null,
    @SerialName("thumb_id") val thumbId: Long? = null,
    @SerialName("can_delete") val canDelete: Boolean? = null,
    @SerialName("sizes") val sizes: List<PhotosPhotoSizes>? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("created") val created: Int? = null,
    @SerialName("size") val size: Int,
)
