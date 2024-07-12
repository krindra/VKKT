package ru.krindra.vkkt.objects.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseBoolInt

/**
 *
 * @param area Area title
 * @param region Region title
 * @param country Country title
 * @param important Information whether the city is included in important cities list
 * @param id Object ID
 * @param title Object title
 */
@Serializable
data class DatabaseCity (
    @SerialName("id") val id: Long,
    @SerialName("title") val title: String,
    @SerialName("area") val area: String? = null,
    @SerialName("region") val region: String? = null,
    @SerialName("country") val country: String? = null,
    @SerialName("important") val important: BaseBoolInt? = null,
)
