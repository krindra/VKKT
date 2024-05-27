package ru.krindra.vknorthtypes.types.utils

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
    @SerialName("type") val type: UtilsDomainResolvedType? = null,
    @SerialName("object_id") val objectId: Long? = null,
)
