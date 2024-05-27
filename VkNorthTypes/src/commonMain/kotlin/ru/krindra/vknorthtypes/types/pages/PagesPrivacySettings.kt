package ru.krindra.vknorthtypes.types.pages

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

private class PagesPrivacySettingsSerializer: EnumAsIntSerializer<PagesPrivacySettings>(
    "PagesPrivacySettings", { it.value }, { v -> PagesPrivacySettings.values().first { it.value == v } }
)

@Serializable(with = PagesPrivacySettingsSerializer::class)
enum class PagesPrivacySettings(val value: Int){
    COMMUNITY_MANAGERS_ONLY(0),
    COMMUNITY_MEMBERS_ONLY(1),
    EVERYONE(2),
}
