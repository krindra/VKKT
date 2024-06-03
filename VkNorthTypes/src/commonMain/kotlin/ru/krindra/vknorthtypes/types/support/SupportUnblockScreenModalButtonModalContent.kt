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
    @SerialName("text") val text: String? = null,
    @SerialName("title") val title: String? = null,
)
