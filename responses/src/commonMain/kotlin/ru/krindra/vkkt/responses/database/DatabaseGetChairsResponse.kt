package ru.krindra.vkkt.responses.database

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.krindra.vkkt.objects.base.BaseObject
import ru.krindra.vkkt.objects.database.*

/**
 * @param count Total number
 * @param items 
 */
@Serializable
data class DatabaseGetChairsResponse (
    @SerialName("count") val count: Int,
    @SerialName("items") val items: List<BaseObject>,
)

