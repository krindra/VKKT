package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

private class GroupsGroupWikiSerializer: EnumAsIntSerializer<GroupsGroupWiki>(
    "GroupsGroupWiki", { it.value }, { v -> GroupsGroupWiki.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupWikiSerializer::class)
enum class GroupsGroupWiki(val value: Int){
    DISABLED(0),
    OPEN(1),
    LIMITED(2),
}
