package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

private class GroupsGroupPhotosSerializer: EnumAsIntSerializer<GroupsGroupPhotos>(
    "GroupsGroupPhotos", { it.value }, { v -> GroupsGroupPhotos.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupPhotosSerializer::class)
enum class GroupsGroupPhotos(val value: Int){
    DISABLED(0),
    OPEN(1),
    LIMITED(2),
}
