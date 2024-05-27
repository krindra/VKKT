package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param name 
 * @param subcategories 
 */
@Serializable
data class GroupsGroupPublicCategoryList (
    @SerialName("name") val name: String? = null,
    @SerialName("subcategories") val subcategories: List<GroupsGroupCategoryType>? = null,
    @SerialName("id") val id: Long? = null,
)
