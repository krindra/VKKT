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
    @SerialName("group_id") val groupId: Long? = null,
    @SerialName("object_id") val objectId: Long? = null,
    @SerialName("type") val type: UtilsDomainResolvedType? = null,
)
