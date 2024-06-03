package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

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

