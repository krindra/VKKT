package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

private class GroupsGroupAccessSerializer: EnumAsIntSerializer<GroupsGroupAccess>(
    "GroupsGroupAccess", { it.value }, { v -> GroupsGroupAccess.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupAccessSerializer::class)
enum class GroupsGroupAccess(val value: Int){
    OPEN(0),
    CLOSED(1),
    PRIVATE(2),
}
