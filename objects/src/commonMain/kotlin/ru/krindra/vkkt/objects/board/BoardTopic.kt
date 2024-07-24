package ru.krindra.vkkt.objects.board

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param comments Comments number
 * @param created Date when the topic has been created in Unixtime
 * @param createdBy Creator ID
 * @param id Topic ID
 * @param isClosed Information whether the topic is closed
 * @param isFixed Information whether the topic is fixed
 * @param title Topic title
 * @param updated Date when the topic has been updated in Unixtime
 * @param updatedBy ID of user who updated the topic
 * @param firstComment First comment text
 * @param lastComment Last comment text
 */
@Serializable
data class BoardTopic (
    @SerialName("id") val id: Int? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("created") val created: Int? = null,
    @SerialName("updated") val updated: Int? = null,
    @SerialName("comments") val comments: Int? = null,
    @SerialName("created_by") val createdBy: Int? = null,
    @SerialName("updated_by") val updatedBy: Int? = null,
    @SerialName("is_fixed") val isFixed: BaseBoolInt? = null,
    @SerialName("is_closed") val isClosed: BaseBoolInt? = null,
    @SerialName("last_comment") val lastComment: String? = null,
    @SerialName("first_comment") val firstComment: String? = null,
)
