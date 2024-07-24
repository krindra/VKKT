package ru.krindra.vkkt.objects.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Language ID
 * @param nativeName Language native name
 */
@Serializable
data class DatabaseLanguageFull (
    @SerialName("id") val id: Int,
    @SerialName("native_name") val nativeName: String,
)
