package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param text Текст
 * @param bgImage Полный URL фонового изображения
 */
@Serializable
data class SupportUnblockScreenTextBackgroundFields (
    @SerialName("type") val type: String,
    @SerialName("text") val text: String? = null,
    @SerialName("bg_image") val bgImage: String? = null,
)
