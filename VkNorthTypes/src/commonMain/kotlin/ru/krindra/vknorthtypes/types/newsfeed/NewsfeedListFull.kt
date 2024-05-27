package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

/**
 *
 * @param noReposts Information whether reposts hiding is enabled
 * @param sourceIds 
 * @param id List ID
 * @param title List title
 */
@Serializable
data class NewsfeedListFull (
    @SerialName("title") val title: String,
    @SerialName("source_ids") val sourceIds: List<Int>? = null,
    @SerialName("id") val id: Long,
    @SerialName("no_reposts") val noReposts: BaseBoolInt? = null,
)
