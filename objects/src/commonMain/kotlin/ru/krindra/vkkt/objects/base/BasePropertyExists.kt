package ru.krindra.vkkt.objects.base

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

private class BasePropertyExistsSerializer: EnumAsIntSerializer<BasePropertyExists>(
    "BasePropertyExists", { it.value }, { v -> BasePropertyExists.values().first { it.value == v } }
)

@Serializable(with = BasePropertyExistsSerializer::class)
enum class BasePropertyExists(val value: Int){
    PROPERTY_EXISTS(1),
}
