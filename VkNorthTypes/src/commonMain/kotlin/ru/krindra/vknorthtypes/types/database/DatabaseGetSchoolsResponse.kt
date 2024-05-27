package ru.krindra.vknorthtypes.types.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class DatabaseGetSchoolsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<DatabaseSchool>,
)

