package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

private class GroupsGroupFullAgeLimitsSerializer: EnumAsIntSerializer<GroupsGroupFullAgeLimits>(
    "GroupsGroupFullAgeLimits", { it.value }, { v -> GroupsGroupFullAgeLimits.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupFullAgeLimitsSerializer::class)
enum class GroupsGroupFullAgeLimits(val value: Int){
    NO(1),
    OVER_16(2),
    OVER_18(3),
}
