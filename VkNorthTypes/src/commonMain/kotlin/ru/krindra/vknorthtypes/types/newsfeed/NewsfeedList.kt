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
    @SerialName("id") val id: Long,
    @SerialName("title") val title: String,
)
