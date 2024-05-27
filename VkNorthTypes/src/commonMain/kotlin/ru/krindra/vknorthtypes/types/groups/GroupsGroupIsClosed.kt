package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

/**
 *
 * Information whether community is closed
 * 
 */
private class GroupsGroupIsClosedSerializer: EnumAsIntSerializer<GroupsGroupIsClosed>(
    "GroupsGroupIsClosed", { it.value }, { v -> GroupsGroupIsClosed.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupIsClosedSerializer::class)
enum class GroupsGroupIsClosed(val value: Int){
    OPEN(0),
    CLOSED(1),
    PRIVATE(2),
}
