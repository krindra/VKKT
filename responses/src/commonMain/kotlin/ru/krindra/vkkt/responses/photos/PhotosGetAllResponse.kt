package ru.krindra.vkkt.responses.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt
import ru.krindra.vkkt.objects.photos.*

/**
 * @param count Total number
 * @param items 
 * @param more Information whether next page is presented
 */
@Serializable
data class PhotosGetAllResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<PhotosPhoto>,
    @SerialName("more") val more: BaseBoolInt? = null,
)

