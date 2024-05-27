package ru.krindra.vknorthtypes.types.base

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

private class BaseBoolIntSerializer: EnumAsIntSerializer<BaseBoolInt>(
    "BaseBoolInt", { it.value }, { v -> BaseBoolInt.values().first { it.value == v } }
)

@Serializable(with = BaseBoolIntSerializer::class)
enum class BaseBoolInt(val value: Int){
    NO(0),
    YES(1),
}
