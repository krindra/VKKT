package ru.krindra.vkkt.objects.groups

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param id 
 * @param name 
 */
@Serializable
data class GroupsGroupCategoryType (
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String,
)
