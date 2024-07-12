package ru.krindra.vkkt.responses.adsweb

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.adsweb.*

/**
 * @param categories 
 */
@Serializable
data class AdswebGetAdCategoriesResponse (
    @SerialName("categories") val categories: List<AdswebGetAdCategoriesResponseCategoriesCategory>,
)

