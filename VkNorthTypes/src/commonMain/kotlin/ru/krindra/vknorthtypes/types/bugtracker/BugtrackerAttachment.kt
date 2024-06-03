package ru.krindra.vknorthtypes.types.bugtracker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.photos.PhotosPhoto
import ru.krindra.vknorthtypes.types.docs.DocsDoc

/**
 *
 * @param doc 
 * @param photo 
 * @param type 
 */
@Serializable
data class BugtrackerAttachment (
    @SerialName("type") val type: String,
    @SerialName("doc") val doc: DocsDoc? = null,
    @SerialName("photo") val photo: PhotosPhoto? = null,
)
