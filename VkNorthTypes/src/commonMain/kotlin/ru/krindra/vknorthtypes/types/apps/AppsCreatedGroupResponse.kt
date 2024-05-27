package ru.krindra.vknorthtypes.types.apps

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @param groupId 
 */
@Serializable
data class AppsCreatedGroupResponse (
    @SerialName("group_id") val groupId: Long,
)

