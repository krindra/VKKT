package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

private class GroupsGroupWallSerializer: EnumAsIntSerializer<GroupsGroupWall>(
    "GroupsGroupWall", { it.value }, { v -> GroupsGroupWall.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupWallSerializer::class)
enum class GroupsGroupWall(val value: Int){
    DISABLED(0),
    OPEN(1),
    LIMITED(2),
    CLOSED(3),
}
