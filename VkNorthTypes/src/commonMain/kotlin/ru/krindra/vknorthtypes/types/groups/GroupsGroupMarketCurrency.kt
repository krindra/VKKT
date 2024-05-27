package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.Serializable
import ru.krindra.vknorthtypes.EnumAsIntSerializer

private class GroupsGroupMarketCurrencySerializer: EnumAsIntSerializer<GroupsGroupMarketCurrency>(
    "GroupsGroupMarketCurrency", { it.value }, { v -> GroupsGroupMarketCurrency.values().first { it.value == v } }
)

@Serializable(with = GroupsGroupMarketCurrencySerializer::class)
enum class GroupsGroupMarketCurrency(val value: Int){
    RUSSIAN_RUBLES(643),
    UKRAINIAN_HRYVNIA(980),
    KAZAKH_TENGE(398),
    EURO(978),
    US_DOLLARS(840),
}
