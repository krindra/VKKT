package ru.krindra.vkkt.responses.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseImage
import ru.krindra.vkkt.objects.photos.*

/**
 * @param images 
 */
@Serializable
data class PhotosSaveOwnerCoverPhotoResponse (
    @SerialName("images") val images: List<BaseImage>? = null,
)

