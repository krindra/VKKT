package ru.krindra.vknorthtypes.types.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type 
 * @param text Текст заголовка
 * @param subheader Текст подзаголовка
 * @param image Картинка над текстом
 * @param gradient Нужен ли градиент  на фоне заголовка
 * @param exitBtn Нужна ли кнопка выхода
 */
@Serializable
data class SupportUnblockScreenHeaderFields (
    @SerialName("gradient") val gradient: Boolean? = null,
    @SerialName("image") val image: String? = null,
    @SerialName("exit_btn") val exitBtn: Boolean? = null,
    @SerialName("subheader") val subheader: String? = null,
    @SerialName("type") val type: String,
    @SerialName("text") val text: String? = null,
)
