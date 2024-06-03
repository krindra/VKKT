package ru.krindra.vknorthtypes.types.notifications

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseGeo
import ru.krindra.vknorthtypes.types.wall.WallWallpostAttachment
import ru.krindra.vknorthtypes.types.base.BaseLikesInfo

/**
 *
 * @param attachments 
 * @param fromId Reply author's ID
 * @param geo 
 * @param id Item ID
 * @param likes 
 * @param text Reply text
 * @param toId Wall owner's ID
 */
@Serializable
data class NotificationsFeedback (
    @SerialName("id") val id: Long? = null,
    @SerialName("geo") val geo: BaseGeo? = null,
    @SerialName("to_id") val toId: Long? = null,
    @SerialName("text") val text: String? = null,
    @SerialName("from_id") val fromId: Long? = null,
    @SerialName("likes") val likes: BaseLikesInfo? = null,
    @SerialName("attachments") val attachments: List<WallWallpostAttachment>? = null,
)
