package ru.krindra.vknorthtypes.types.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Language ID
 * @param nativeName Language native name
 */
@Serializable
data class DatabaseLanguageFull (
    @SerialName("native_name") val nativeName: String,
    @SerialName("id") val id: Long,
)
