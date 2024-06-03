package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param title 
 * @param shortDesc Краткое описание, выпадающее при нажатии
 * @param targetScreen Экран, на который происходит переход; обычно содержимое другого экрана - просто заголовок с текстом и кнопкой
 */
@Serializable
data class SupportUnblockScreenSlidersFieldsItem (
    @SerialName("title") val title: String? = null,
    @SerialName("short_desc") val shortDesc: String? = null,
    @SerialName("target_screen") val targetScreen: String? = null,
)
