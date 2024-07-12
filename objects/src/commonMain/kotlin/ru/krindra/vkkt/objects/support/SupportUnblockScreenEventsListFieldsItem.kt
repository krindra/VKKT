package ru.krindra.vkkt.objects.support

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param date Дата блокировки
 * @param reason Причина блокировки
 */
@Serializable
data class SupportUnblockScreenEventsListFieldsItem (
    @SerialName("date") val date: String? = null,
    @SerialName("reason") val reason: String? = null,
)
