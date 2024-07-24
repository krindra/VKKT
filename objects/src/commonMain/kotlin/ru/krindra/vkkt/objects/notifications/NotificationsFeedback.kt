package ru.krindra.vkkt.objects.notifications

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseGeo
import ru.krindra.vkkt.objects.wall.WallWallpostAttachment
import ru.krindra.vkkt.objects.base.BaseLikesInfo

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
    @SerialName("id") val id: Int? = null,
    @SerialName("geo") val geo: BaseGeo? = null,
    @SerialName("to_id") val toId: Int? = null,
    @SerialName("text") val text: String? = null,
    @SerialName("from_id") val fromId: Int? = null,
    @SerialName("likes") val likes: BaseLikesInfo? = null,
    @SerialName("attachments") val attachments: List<WallWallpostAttachment>? = null,
)
