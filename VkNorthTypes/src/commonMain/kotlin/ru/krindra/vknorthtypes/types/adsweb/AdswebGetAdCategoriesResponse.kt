package ru.krindra.vknorthtypes.types.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param categories 
 */
@Serializable
data class AdswebGetAdCategoriesResponse (
    @SerialName("categories") val categories: List<AdswebGetAdCategoriesResponseCategoriesCategory>,
)

