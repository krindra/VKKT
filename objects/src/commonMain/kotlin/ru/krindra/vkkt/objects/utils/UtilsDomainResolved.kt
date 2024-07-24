package ru.krindra.vkkt.objects.utils

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param objectId Object ID
 * @param groupId Group ID
 * @param type 
 */
@Serializable
data class UtilsDomainResolved (
    @SerialName("group_id") val groupId: Int? = null,
    @SerialName("object_id") val objectId: Int? = null,
    @SerialName("type") val type: UtilsDomainResolvedType? = null,
)
