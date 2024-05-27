package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

private class GroupsGroupSuggestedPrivacySerializer: EnumAsIntSerializer<GroupsGroupSuggestedPrivacy>(
    "GroupsGroupSuggestedPrivacy", { it.value }, { v -> GroupsGroupSuggestedPrivacy.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupSuggestedPrivacySerializer::class)
enum class GroupsGroupSuggestedPrivacy(val value: Int){
    NONE(0),
    ALL(1),
    SUBSCRIBERS(2),
}
