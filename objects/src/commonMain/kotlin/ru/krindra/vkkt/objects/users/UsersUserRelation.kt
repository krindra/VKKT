package ru.krindra.vkkt.objects.users

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

private class UsersUserRelationSerializer: EnumAsIntSerializer<UsersUserRelation>(
    "UsersUserRelation", { it.value }, { v -> UsersUserRelation.values().first { it.value == v } }
)

@Serializable(with = UsersUserRelationSerializer::class)
enum class UsersUserRelation(val value: Int){
    NOT_SPECIFIED(0),
    SINGLE(1),
    IN_A_RELATIONSHIP(2),
    ENGAGED(3),
    MARRIED(4),
    COMPLICATED(5),
    ACTIVELY_SEARCHING(6),
    IN_LOVE(7),
    IN_A_CIVIL_UNION(8),
}
