package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

private class GroupsGroupVideoSerializer: EnumAsIntSerializer<GroupsGroupVideo>(
    "GroupsGroupVideo", { it.value }, { v -> GroupsGroupVideo.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupVideoSerializer::class)
enum class GroupsGroupVideo(val value: Int){
    DISABLED(0),
    OPEN(1),
    LIMITED(2),
}
