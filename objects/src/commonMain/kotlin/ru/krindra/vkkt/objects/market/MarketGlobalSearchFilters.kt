package ru.krindra.vkkt.objects.market

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseCountry
import ru.krindra.vkkt.objects.base.BaseCity

/**
 *
 * @param city 
 * @param country 
 */
@Serializable
data class MarketGlobalSearchFilters (
    @SerialName("city") val city: BaseCity? = null,
    @SerialName("country") val country: BaseCountry? = null,
)
