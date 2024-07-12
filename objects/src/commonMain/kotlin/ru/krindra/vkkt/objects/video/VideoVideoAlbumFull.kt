package ru.krindra.vkkt.objects.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BasePropertyExists
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param count Total number of videos in album
 * @param image Album cover image in different sizes
 * @param imageBlur Need blur album thumb or not
 * @param isSystem Information whether album is system
 * @param updatedTime Date when the album has been updated last time in Unixtime
 * @param canEdit Is user can edit playlist
 * @param canDelete Is user can delete playlist
 * @param canUpload Is user can upload video to playlist
 * @param id Album ID
 * @param ownerId Album owner's ID
 * @param title Album title
 * @param trackCode Album trackcode
 * @param responseType 
 */
@Serializable
data class VideoVideoAlbumFull (
    @SerialName("id") val id: Long,
    @SerialName("count") val count: Int,
    @SerialName("title") val title: String,
    @SerialName("owner_id") val ownerId: Long,
    @SerialName("updated_time") val updatedTime: Int,
    @SerialName("track_code") val trackCode: String? = null,
    @SerialName("can_edit") val canEdit: BaseBoolInt? = null,
    @SerialName("can_delete") val canDelete: BaseBoolInt? = null,
    @SerialName("can_upload") val canUpload: BaseBoolInt? = null,
    @SerialName("image") val image: List<VideoVideoImage>? = null,
    @SerialName("response_type") val responseType: String? = null,
    @SerialName("is_system") val isSystem: BasePropertyExists? = null,
    @SerialName("image_blur") val imageBlur: BasePropertyExists? = null,
)
