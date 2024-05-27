package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

private class GroupsGroupAgeLimitsSerializer: EnumAsIntSerializer<GroupsGroupAgeLimits>(
    "GroupsGroupAgeLimits", { it.value }, { v -> GroupsGroupAgeLimits.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupAgeLimitsSerializer::class)
enum class GroupsGroupAgeLimits(val value: Int){
    UNLIMITED(1),
    _16_PLUS(2),
    _18_PLUS(3),
}
