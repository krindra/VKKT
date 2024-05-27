package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param title 
 * @param text 
 */
@Serializable
data class SupportUnblockScreenModalButtonModalContent (
    @SerialName("title") val title: String? = null,
    @SerialName("text") val text: String? = null,
)
