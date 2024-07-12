package ru.krindra.vkkt.objects.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param items 
 */
@Serializable
data class SupportUnblockScreenSlidersFields (
    @SerialName("type") val type: String,
    @SerialName("items") val items: List<SupportUnblockScreenSlidersFieldsItem>? = null,
)
