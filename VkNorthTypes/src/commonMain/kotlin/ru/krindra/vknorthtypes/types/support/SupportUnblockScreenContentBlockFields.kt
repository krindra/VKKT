package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param contentType Тип контента
 */
@Serializable
data class SupportUnblockScreenContentBlockFields (
    @SerialName("type") val type: String,
    @SerialName("content_type") val contentType: String? = null,
)
