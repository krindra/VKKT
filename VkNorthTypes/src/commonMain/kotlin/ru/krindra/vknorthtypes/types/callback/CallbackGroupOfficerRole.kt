package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

private class CallbackGroupOfficerRoleSerializer: EnumAsIntSerializer<CallbackGroupOfficerRole>(
    "CallbackGroupOfficerRole", { it.value }, { v -> CallbackGroupOfficerRole.values().first { it.value == v } }
)

@Serializable(with = CallbackGroupOfficerRoleSerializer::class)
enum class CallbackGroupOfficerRole(val value: Int){
    NONE(0),
    MODERATOR(1),
    EDITOR(2),
    ADMINISTRATOR(3),
}
