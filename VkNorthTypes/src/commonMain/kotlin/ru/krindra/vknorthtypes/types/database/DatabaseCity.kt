package ru.krindra.vknorthtypes.types.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseBoolInt

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
    @SerialName("title") val title: String,
    @SerialName("important") val important: BaseBoolInt? = null,
    @SerialName("region") val region: String? = null,
    @SerialName("id") val id: Long,
    @SerialName("country") val country: String? = null,
    @SerialName("area") val area: String? = null,
)
