package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class PhotosSearchResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<PhotosPhoto>,
)

