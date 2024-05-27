package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Category ID
 * @param name Category name
 * @param subcategories 
 */
@Serializable
data class GroupsGroupCategory (
    @SerialName("subcategories") val subcategories: List<GroupsGroupSubcategory>? = null,
    @SerialName("name") val name: String,
    @SerialName("id") val id: Long,
)
