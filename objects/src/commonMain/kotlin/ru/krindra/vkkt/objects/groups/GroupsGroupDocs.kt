package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

private class GroupsGroupDocsSerializer: EnumAsIntSerializer<GroupsGroupDocs>(
    "GroupsGroupDocs", { it.value }, { v -> GroupsGroupDocs.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupDocsSerializer::class)
enum class GroupsGroupDocs(val value: Int){
    DISABLED(0),
    OPEN(1),
    LIMITED(2),
}
