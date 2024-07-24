package ru.krindra.vkkt.objects.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param noReposts Information whether reposts hiding is enabled
 * @param sourceIds 
 * @param id List ID
 * @param title List title
 */
@Serializable
data class NewsfeedListFull (
    @SerialName("id") val id: Int,
    @SerialName("title") val title: String,
    @SerialName("source_ids") val sourceIds: List<Int>? = null,
    @SerialName("no_reposts") val noReposts: BaseBoolInt? = null,
)
