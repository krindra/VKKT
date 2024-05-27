package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param header Заголовок над пунктами
 * @param items 
 */
@Serializable
data class SupportUnblockScreenEventsListFields (
    @SerialName("header") val header: String? = null,
    @SerialName("items") val items: List<SupportUnblockScreenEventsListFieldsItem>? = null,
    @SerialName("type") val type: String,
)
