package ru.krindra.vkkt.responses.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.photos.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class PhotosGetResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<PhotosPhoto>,
)

