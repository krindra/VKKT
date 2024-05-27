package ru.krindra.vknorthtypes.types.ads

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

/**
 *
 * Campaign status
 * 
 */
private class AdsCampaignStatusSerializer: EnumAsIntSerializer<AdsCampaignStatus>(
    "AdsCampaignStatus", { it.value }, { v -> AdsCampaignStatus.values().first { it.value == v } }
)

@Serializable(with = AdsCampaignStatusSerializer::class)
enum class AdsCampaignStatus(val value: Int){
    STOPPED(0),
    STARTED(1),
    DELETED(2),
}
