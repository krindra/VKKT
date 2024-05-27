package ru.krindra.vknorthtypes.types.newsfeed

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id List ID
 * @param title List title
 */
@Serializable
data class NewsfeedList (
    @SerialName("title") val title: String,
    @SerialName("id") val id: Long,
)
