package ru.krindra.vknorthtypes.types.link

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type Object type
 * @param ownerId Owner ID
 * @param itemId Item ID
 */
@Serializable
data class LinkTargetObject (
    @SerialName("type") val type: String? = null,
    @SerialName("item_id") val itemId: Long? = null,
    @SerialName("owner_id") val ownerId: Long? = null,
)
