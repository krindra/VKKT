package ru.krindra.vkkt.objects.groups

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
    @SerialName("id") val id: Int? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("subcategories") val subcategories: List<GroupsGroupCategoryType>? = null,
)
