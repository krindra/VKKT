package ru.krindra.vknorthtypes.types.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.types.base.BaseCountry


/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class DatabaseGetCountriesResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<BaseCountry>,
)

