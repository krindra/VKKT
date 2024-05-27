package ru.krindra.vknorthtypes.types.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id Category ID
 * @param name Category name
 * @param pageCount Pages number
 * @param pagePreviews 
 * @param subcategories 
 */
@Serializable
data class GroupsGroupCategoryFull (
    @SerialName("subcategories") val subcategories: List<GroupsGroupCategory>? = null,
    @SerialName("id") val id: Long,
    @SerialName("page_previews") val pagePreviews: List<GroupsGroup>,
    @SerialName("name") val name: String,
    @SerialName("page_count") val pageCount: Int,
)
