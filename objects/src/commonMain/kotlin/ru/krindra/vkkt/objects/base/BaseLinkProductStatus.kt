package ru.krindra.vkkt.objects.base

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * Status representation
 * 
 */
@Serializable
enum class BaseLinkProductStatus(val value: String){
    @SerialName("active") ACTIVE("active"),
    @SerialName("blocked") BLOCKED("blocked"),
    @SerialName("sold") SOLD("sold"),
    @SerialName("deleted") DELETED("deleted"),
    @SerialName("archived") ARCHIVED("archived"),
}
