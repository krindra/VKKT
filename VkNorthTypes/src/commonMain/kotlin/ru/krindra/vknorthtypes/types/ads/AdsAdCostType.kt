package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

/**
 *
 * Cost type
 * 
 */
private class AdsAdCostTypeSerializer: EnumAsIntSerializer<AdsAdCostType>(
    "AdsAdCostType", { it.value }, { v -> AdsAdCostType.values().first { it.value == v } }
)

@Serializable(with = AdsAdCostTypeSerializer::class)
enum class AdsAdCostType(val value: Int){
    PER_CLICKS(0),
    PER_IMPRESSIONS(1),
    PER_ACTIONS(2),
    PER_IMPRESSIONS_OPTIMIZED(3),
}
