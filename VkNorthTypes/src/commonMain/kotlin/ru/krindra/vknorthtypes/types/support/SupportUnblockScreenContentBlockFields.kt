package ru.krindra.vknorthtypes.types.support

// **********
// THIS FILE IS AUTOGENERATED!!! DO NOT EDIT IT!!!
// **********
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param contentType Тип контента
 */
@Serializable
data class SupportUnblockScreenContentBlockFields (
    @SerialName("content_type") val contentType: String? = null,
    @SerialName("type") val type: String,
)