package ru.krindra.vkkt.objects.ads

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

/**
 *
 * Ad atatus
 * 
 */
private class AdsAdStatusSerializer: EnumAsIntSerializer<AdsAdStatus>(
    "AdsAdStatus", { it.value }, { v -> AdsAdStatus.values().first { it.value == v } }
)

@Serializable(with = AdsAdStatusSerializer::class)
enum class AdsAdStatus(val value: Int){
    STOPPED(0),
    STARTED(1),
    DELETED(2),
}
