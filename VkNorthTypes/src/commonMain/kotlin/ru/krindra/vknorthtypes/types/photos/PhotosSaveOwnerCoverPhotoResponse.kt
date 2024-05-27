package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseImage


/**
 * @param images 
 */
@Serializable
data class PhotosSaveOwnerCoverPhotoResponse (
    @SerialName("images") val images: List<BaseImage>? = null,
)

