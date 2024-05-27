package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

private class GroupsGroupAudioSerializer: EnumAsIntSerializer<GroupsGroupAudio>(
    "GroupsGroupAudio", { it.value }, { v -> GroupsGroupAudio.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupAudioSerializer::class)
enum class GroupsGroupAudio(val value: Int){
    DISABLED(0),
    OPEN(1),
    LIMITED(2),
}
