package ru.krindra.vknorthtypes.types.gifts

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

/**
 *
 * Gift privacy
 * 
 */
private class GiftsGiftPrivacySerializer: EnumAsIntSerializer<GiftsGiftPrivacy>(
    "GiftsGiftPrivacy", { it.value }, { v -> GiftsGiftPrivacy.values().first { it.value == v } }
)

@Serializable(with = GiftsGiftPrivacySerializer::class)
enum class GiftsGiftPrivacy(val value: Int){
    NAME_AND_MESSAGE_FOR_ALL(0),
    NAME_FOR_ALL(1),
    NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY(2),
}
