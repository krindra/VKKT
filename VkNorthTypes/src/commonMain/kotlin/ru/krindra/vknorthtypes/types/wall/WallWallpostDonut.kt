package ru.krindra.vknorthtypes.types.wall

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Info about paid wall post
 * 
 * @param isDonut Post only for dons
 * @param paidDuration Value of this field need to pass in wall.post/edit in donut_paid_duration
 * @param placeholder If placeholder was respond, text and all attachments will be hidden
 * @param canPublishFreeCopy Says whether group admin can post free copy of this donut post
 * @param editMode Says what user can edit in post about donut properties
 */
@Serializable
data class WallWallpostDonut (
    @SerialName("is_donut") val isDonut: Boolean,
    @SerialName("edit_mode") val editMode: String? = null,
    @SerialName("paid_duration") val paidDuration: Int? = null,
    @SerialName("can_publish_free_copy") val canPublishFreeCopy: Boolean? = null,
    @SerialName("placeholder") val placeholder: WallWallpostDonutPlaceholder? = null,
)
