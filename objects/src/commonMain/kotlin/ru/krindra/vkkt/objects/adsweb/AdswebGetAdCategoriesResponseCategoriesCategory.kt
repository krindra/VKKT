package ru.krindra.vkkt.objects.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param name 
 */
@Serializable
data class AdswebGetAdCategoriesResponseCategoriesCategory (
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String,
)
