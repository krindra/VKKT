package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param name 
 */
@Serializable
data class GroupsGroupCategoryType (
    @SerialName("id") val id: Long,
    @SerialName("name") val name: String,
)
