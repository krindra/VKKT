package ru.krindra.vkkt.objects.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param date Date when tag has been added in Unixtime
 * @param id Tag ID
 * @param placerId ID of the tag creator
 * @param taggedName Tag description
 * @param description Tagged description.
 * @param userId Tagged user ID
 * @param viewed Information whether the tag is reviewed
 * @param x Coordinate X of the left upper corner
 * @param x2 Coordinate X of the right lower corner
 * @param y Coordinate Y of the left upper corner
 * @param y2 Coordinate Y of the right lower corner
 */
@Serializable
data class PhotosPhotoTag (
    @SerialName("id") val id: Long,
    @SerialName("x") val x: Double,
    @SerialName("y") val y: Double,
    @SerialName("x2") val x2: Double,
    @SerialName("y2") val y2: Double,
    @SerialName("date") val date: Int,
    @SerialName("user_id") val userId: Long,
    @SerialName("placer_id") val placerId: Long,
    @SerialName("viewed") val viewed: BaseBoolInt,
    @SerialName("tagged_name") val taggedName: String,
    @SerialName("description") val description: String? = null,
)
