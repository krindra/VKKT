package ru.krindra.vknorthtypes.types.photos

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param title 
 * @param action 
 * @param style 
 */
@Serializable
data class PhotosTagsSuggestionItemButton (
    @SerialName("title") val title: String? = null,
    @SerialName("style") val style: String? = null,
    @SerialName("action") val action: String? = null,
)
