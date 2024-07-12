package ru.krindra.vkkt.objects.fave

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Tag id
 * @param name Tag name
 */
@Serializable
data class FaveTag (
    @SerialName("id") val id: Long? = null,
    @SerialName("name") val name: String? = null,
)
