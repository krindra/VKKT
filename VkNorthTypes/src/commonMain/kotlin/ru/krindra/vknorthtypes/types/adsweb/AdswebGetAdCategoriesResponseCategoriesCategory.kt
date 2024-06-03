package ru.krindra.vknorthtypes.types.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param name 
 */
@Serializable
data class AdswebGetAdCategoriesResponseCategoriesCategory (
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
)
