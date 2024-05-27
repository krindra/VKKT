package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param items 
 */
@Serializable
data class SupportUnblockScreenSlidersFields (
    @SerialName("items") val items: List<SupportUnblockScreenSlidersFieldsItem>? = null,
    @SerialName("type") val type: String,
)
