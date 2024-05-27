package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

private class GroupsGroupTopicsSerializer: EnumAsIntSerializer<GroupsGroupTopics>(
    "GroupsGroupTopics", { it.value }, { v -> GroupsGroupTopics.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupTopicsSerializer::class)
enum class GroupsGroupTopics(val value: Int){
    DISABLED(0),
    OPEN(1),
    LIMITED(2),
}
