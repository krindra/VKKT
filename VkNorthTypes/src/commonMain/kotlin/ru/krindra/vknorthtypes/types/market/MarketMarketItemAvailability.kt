package ru.krindra.vknorthtypes.types.market

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

/**
 *
 * Information whether the item is available
 * 
 */
private class MarketMarketItemAvailabilitySerializer: EnumAsIntSerializer<MarketMarketItemAvailability>(
    "MarketMarketItemAvailability", { it.value }, { v -> MarketMarketItemAvailability.values().first { it.value == v } }
)

@Serializable(with = MarketMarketItemAvailabilitySerializer::class)
enum class MarketMarketItemAvailability(val value: Int){
    AVAILABLE(0),
    REMOVED(1),
    UNAVAILABLE(2),
}
