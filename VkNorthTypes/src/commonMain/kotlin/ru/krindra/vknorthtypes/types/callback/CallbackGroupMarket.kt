package ru.krindra.vknorthtypes.types.callback

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

private class CallbackGroupMarketSerializer: EnumAsIntSerializer<CallbackGroupMarket>(
    "CallbackGroupMarket", { it.value }, { v -> CallbackGroupMarket.values().first { it.value == v } }
)

@Serializable(with = CallbackGroupMarketSerializer::class)
enum class CallbackGroupMarket(val value: Int){
    DISABLED(0),
    OPEN(1),
}
