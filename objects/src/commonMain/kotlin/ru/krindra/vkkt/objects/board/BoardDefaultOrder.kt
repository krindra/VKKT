package ru.krindra.vkkt.objects.board

import kotlinx.serialization.Serializable
import ru.krindra.vkkt.utils.EnumAsIntSerializer

/**
 *
 * Sort type
 * 
 */
private class BoardDefaultOrderSerializer: EnumAsIntSerializer<BoardDefaultOrder>(
    "BoardDefaultOrder", { it.value }, { v -> BoardDefaultOrder.values().first { it.value == v } }
)

@Serializable(with = BoardDefaultOrderSerializer::class)
enum class BoardDefaultOrder(val value: Int){
    DESC_UPDATED(1),
    DESC_CREATED(2),
    ASC_UPDATED(-1),
    ASC_CREATED(-2),
}
